
package bookAndGenreServlet;

import application.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import genreDAO.GenreBasedBook;

@WebServlet(name = "GenreBasedBook", urlPatterns = {"/genreBasedBook"})
public class GenreBasedBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession  session = request.getSession();
        String genreTitle = request.getParameter("genre_title");
        List<Book> bookGenre = GenreBasedBook.genreChoose(genreTitle);
        if(!bookGenre.isEmpty()){
        session.setAttribute("book_list", bookGenre);
        RequestDispatcher rd = request.getRequestDispatcher("book_overview.jsp");
        rd.forward(request, response);
        } else{
            PrintWriter out = response.getWriter();
            out.println("<body><p>Sorry nothing under "+genreTitle+" genre</p></body>");
            RequestDispatcher rd = request.getRequestDispatcher("book_overview.jsp");
            rd.include(request, response);
        }
    }

   
}
