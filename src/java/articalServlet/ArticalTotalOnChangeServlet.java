package articalServlet;

import application.Artical;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import articalDAO.ArticalSelectDAO;
import articalDAO.ArticalUpdate;
import cartDAO.CartDAO;
import cartDAO.CartUpdateDAO;
import java.util.List;

@WebServlet(name = "ArticalTotalOnChangeServlet", urlPatterns = {"/ArticalTotalOnChange"})
public class ArticalTotalOnChangeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String recivedParam = request.getParameter("artical_NumberOfOrder");
        double price = Double.parseDouble(request.getParameter("artical_price"));
        int id = Integer.parseInt(request.getParameter("articalID"));
        int numberOfOrder = 0;
        if (recivedParam != null && (!recivedParam.trim().isEmpty())) {
            numberOfOrder = Integer.parseInt(recivedParam);
        }
        //Total per artical
        Double totalArtical = (Double) session.getAttribute("totalArtical");
        if (totalArtical == null) {
            totalArtical = price;
            totalArtical *= numberOfOrder;
        } else {
            totalArtical = price;
            totalArtical *= numberOfOrder;
        }
        session.setAttribute("totalArtical", totalArtical);
        ArticalUpdate.updateAtical(numberOfOrder, totalArtical, id);
        //Total All
        Double totalValue = (Double) session.getAttribute("total");
        if (totalValue == null || session == null) {
            totalValue = 0.0;
        } else {
            totalValue = 0.0;
            List<Artical> articalList = ArticalSelectDAO.selectArticals();
            for (Artical a : articalList) {
            totalValue+=a.getTotal();
            }
        }
        session.setAttribute("total", totalValue);
        CartUpdateDAO.updateTotal(CartDAO.getAutoIncKeyFromApi(), totalValue);
        RequestDispatcher rd = request.getRequestDispatcher("cart_overview.jsp");
        rd.forward(request, response);
    }

}
