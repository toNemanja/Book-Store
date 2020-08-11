package genreDAO;

import bookDAO.BookDAO;
import application.Book;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GenreBasedBook {


    public static List<Book> genreChoose(String title) {
        ResultSet rs = null;
        try {
            BookDAO.getBookList().clear();
            String chooseGenre = "select * from books as b "
                    + "join books_genre as bg on b.id=bg.book_id join genre as g"
                    + " on bg.genre_id=g.id where g.title='"+title+"'";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(chooseGenre);
            rs = ps.executeQuery(chooseGenre);
            while (rs.next()) {
                int idBook = rs.getInt("id");
                String titleBook = rs.getString("title");
                String descriptionBook = rs.getString("description");
                double price = rs.getDouble("price");
                int imageId = rs.getInt("image_id");
                Book book = new Book(idBook, titleBook, descriptionBook, price,imageId);
                BookDAO.getBookList().add(book);
            }
            return   BookDAO.getBookList();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}
