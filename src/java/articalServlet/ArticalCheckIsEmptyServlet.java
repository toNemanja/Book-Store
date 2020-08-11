package articalServlet;

import application.Artical;
import articalDAO.ArticalSelectDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ArticalCheckIsEmptyServlet", urlPatterns = {"/ArticalCheck"})
public class ArticalCheckIsEmptyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        List<Artical> articalList = ArticalSelectDAO.selectArticals();
        if (articalList.isEmpty()) {
            //out.print("<body> Please add some articles before continue</body>");
            //out.print("<body> Please add some articles before continue</body>");
//               RequestDispatcher rd = request.getRequestDispatcher("cart_overview.jsp");
//               rd.include(request, response);
            out.println("<script type='text/javascript'>");
            RequestDispatcher rd = request.getRequestDispatcher("/JavaScript/alert.js");
            rd.include(request, response); 
            out.println("</script>");
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("user_newEdit.jsp");
            rd.forward(request, response);
        }
    }

}
