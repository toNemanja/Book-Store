
package bookAndGenreServlet;

import application.Genre;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import genreDAO.GenreDAO;

@WebServlet(name = "ShowGenreServlet", urlPatterns = {"/ShowGenreServlet"})
public class ShowGenreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
       List<Genre> genreList = GenreDAO.selectGenre();
        session.setAttribute("genreList", genreList);
        RequestDispatcher rd = request.getRequestDispatcher("book_overview.jsp");
        rd.forward(request, response);
               
    }


}
