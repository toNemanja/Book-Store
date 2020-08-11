package genreDAO;

import bookDAO.BookInsertDAO;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;

public class Books_GenreDAO {

    public static void insertBookGenre(int id) {
        try {
            String insertBookGenre="insert into books_genre(book_id,genre_id)"
                    + " values(?,?)";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(insertBookGenre);
            ps.setInt(1, BookInsertDAO.getAutoIncKeyFromBook());
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
