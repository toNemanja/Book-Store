package cartServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import articalDAO.ArticalDAO;

public class AddToCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String title = request.getParameter("book_title");
        double price = Double.parseDouble(request.getParameter("book_price"));
        Double totalCart = (Double) session.getAttribute("total");
        if (totalCart == null) {
            totalCart = 0.0;
        }
        totalCart += price;
        ArticalDAO.insertArtical(title, price, totalCart);
      
        session.setAttribute("total", totalCart);
        RequestDispatcher rd = request.getRequestDispatcher("book_overview.jsp");
        rd.forward(request, response);

    }

}
