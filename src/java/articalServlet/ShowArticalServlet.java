package articalServlet;

import application.Artical;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import articalDAO.ArticalSelectDAO;
import java.io.PrintWriter;

public class ShowArticalServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        Double total = (Double) session.getAttribute("total");
        if (total == null) {
            total = 0.0;
        }
        //Proveri da li ima artikala, ako nema resetuj totalAll
        List<Artical> articalList = ArticalSelectDAO.selectArticals();
        if (articalList.isEmpty()) {
            total = 0.0;
            out.print("<body><h2>Your cart is empty</h2><br>");   
            out.print("<form action='book_overview.jsp'>");
            out.print("<button type='submit'>Back</button>");
            out.print("</form></body>");

        } else {
            total = 0.0;
            for (Artical a : articalList) {
                total += a.getTotal();
            }
            session.setAttribute("articalList", articalList);
            session.setAttribute("total", total);
            RequestDispatcher rd = request.getRequestDispatcher("cart_overview.jsp");
            rd.forward(request, response);
        }

    }

}
