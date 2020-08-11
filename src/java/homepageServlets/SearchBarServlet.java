
package homepageServlets;

import application.Book;
import application.Genre;
import bookDAO.SearchBarDAO;
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

@WebServlet(name = "SearchBarServlet", urlPatterns = {"/Search"})
public class SearchBarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
       String searchInput = request.getParameter("searchInput");
       List<Book> searchResultList = SearchBarDAO.search(searchInput);
       List<Genre> genreList = GenreDAO.selectGenre();
       session.setAttribute("genreList", genreList);
       session.setAttribute("searchResultList", searchResultList);
       RequestDispatcher rd = request.getRequestDispatcher("searchResults.jsp");
       rd.forward(request, response);
        
    }

  
}
