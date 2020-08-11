package cartServlet;

import application.Artical;
import articalDAO.ArticalSelectDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cartDAO.CartDeleteDAO;
import java.io.PrintWriter;
import java.util.List;

public class DeleteFromCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        int articalID = Integer.parseInt(request.getParameter("articalID"));
        //delete artical
        CartDeleteDAO.deleteArtical(articalID);
        List<Artical> articalList = ArticalSelectDAO.selectArticals();
        Double total = (Double) session.getAttribute("total");
        if (total == null) {
            total = 0.0;
        } else {
            total = 0.0;

            for (Artical a : articalList) {
                total += a.getTotal();
            }

        }
        if (articalList.isEmpty()) {
            CartDeleteDAO.deleteCart();
            out.print("<body><h2>Your cart is empty</h2><br>");   
            out.print("<form action='book_overview.jsp'>");
            out.print("<button type='submit'>Back</button>");
            out.print("</form></body>");
 
        } else {
            // update Cart value
            CartDeleteDAO.updateCartTotal(total);
            session.setAttribute("total", total);
            RequestDispatcher rd = request.getRequestDispatcher("cart_overview.jsp");
            rd.forward(request, response);
        }

    }

}
