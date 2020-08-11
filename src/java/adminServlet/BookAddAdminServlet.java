package adminServlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import bookDAO.BookInsertDAO;
import genreDAO.Books_GenreDAO;
import imageDAO.ImageDAO;
import java.util.Arrays;

@WebServlet(name = "BookAddAdmin", urlPatterns = {"/bookaddadmin"})
@MultipartConfig
public class BookAddAdminServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Uzimanje parametara
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        String author = request.getParameter("author");
        int numberOfPages = Integer.parseInt(request.getParameter("numberOfPages"));
        String binding = request.getParameter("binding");
        String dimensions = request.getParameter("dimensions");
        String releaseDate = request.getParameter("releaseDate");
        String booksGenreId[] = request.getParameterValues("selectGenre");
        int[] booksGenreInt = Arrays.stream(booksGenreId).mapToInt(Integer::parseInt).toArray();
        
        //Insertuj sliku
        Part filePart = request.getPart("myimg");
        try {
            ImageDAO.insertImage(filePart);
        } catch (Exception ex) {
            Logger.getLogger(BookAddAdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Insertuj knjigu
        BookInsertDAO.insertBook(title, description, price, author, numberOfPages,
                binding, dimensions, releaseDate);
        
        //insertuj zanrove
        for (int i = 0; i < booksGenreInt.length; i++) {
            Books_GenreDAO.insertBookGenre(booksGenreInt[i]);
        }
        RequestDispatcher rd = request.getRequestDispatcher("Home");
        rd.forward(request, response);
    }

}
