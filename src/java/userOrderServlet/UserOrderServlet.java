
package userOrderServlet;

import application.Artical;
import application.TempArtical;
import application.User;
import application.UserOrder;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import articalDAO.ArticalSelectDAO;
import userOrderDAO.UserOrderSelectDAO;
import tempArticalDAO.TempArticalDAO;
import tempArticalDAO.TempArticalSelectDAO;

@WebServlet(name = "UserOrderServlet", urlPatterns = {"/userorderservlet"})
public class UserOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        //vidi da li mozes bez ove dve linije koda ispod
        ArticalSelectDAO.selectArticals();
        List<UserOrder> userOrderList = UserOrderSelectDAO.selectUserOrder();
        
        for(Artical a : ArticalSelectDAO.getArticalList()){
            TempArticalDAO.insertUserOrder(a.getTitle(), a.getPrice(), a.getNumberOfOrder(), a.getTotal());
        }
        
        List<TempArtical> tempArticalList = TempArticalSelectDAO.selectTempArtical();    
        session.getAttribute("total");
        session.setAttribute("ArticalList", tempArticalList);
        session.setAttribute("UserList", userOrderList);
        RequestDispatcher rd = request.getRequestDispatcher("order_overview.jsp");
        rd.forward(request, response);
    }

  
}
