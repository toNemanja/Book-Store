
package adminServlet;

import application.Genre;
import genreDAO.GenreDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "adminAddBookServlet", urlPatterns = {"/adminAddBook"})
public class AdminAddBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
         List<Genre> genreList = GenreDAO.selectGenre();
         session.setAttribute("genreList", genreList);
         RequestDispatcher rd = request.getRequestDispatcher("book_newEdit.jsp");
         rd.forward(request, response);
    }


}
