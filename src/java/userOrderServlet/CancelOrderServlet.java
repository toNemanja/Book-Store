package userOrderServlet;

import articalDAO.ArticalSelectDAO;
import cartDAO.CartDAO;
import cartDAO.CartDeleteDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tempArticalDAO.TempArticalDeleteDAO;
import tempArticalDAO.TempArticalSelectDAO;
import userDAO.UserDeleteDAO;
import userOrderDAO.UserOrderDeleteDAO;
import userOrderDAO.UserOrderSelectDAO;

@WebServlet(name = "CancelOrderServlet", urlPatterns = {"/CancelOrder"})
public class CancelOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CartDeleteDAO.deleteAllArticals();
        CartDeleteDAO.deleteCart();
        TempArticalDeleteDAO.deleteAllTempArticals();
        UserOrderDeleteDAO.deleteUserOrder();  
        UserDeleteDAO.deleteUser();
        CartDAO.getCartList().clear();
        ArticalSelectDAO.getArticalList().clear();
        UserOrderSelectDAO.getUserOrderList().clear();
        TempArticalSelectDAO.getTempArticalList().clear();

        RequestDispatcher rd = request.getRequestDispatcher("Home");
        rd.forward(request, response);

    }

}
