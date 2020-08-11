package bookDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import imageDAO.ImageDAO;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class BookInsertDAO {

    private static int autoIncKeyFromBook;

    public static void insertBook(String title, String description,
            double price,String author,int numberOfPages, String binding,
            String dimensions,String releaseDate) {
        ResultSet rs = null;
        try {
            String insertBook = ("insert into books(title,description,price,image_id,"
                    + "author,numberOfPages,binding,dimensions,releaseDate)"
                    + "values(?,?,?,?,?,?,?,?,?)");
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(insertBook,
                    RETURN_GENERATED_KEYS);
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setDouble(3, price);
            ps.setInt(4, ImageDAO.getAutoIncKeyFromApi());
            ps.setString(5, author);
            ps.setInt(6, numberOfPages);
            ps.setString(7, binding);
            ps.setString(8, dimensions);
            ps.setString(9, releaseDate);
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                autoIncKeyFromBook = rs.getInt(1);
            }

        } catch (Exception e) {
            System.err.println(e);

        }
    }

    public static int getAutoIncKeyFromBook() {
        return autoIncKeyFromBook;
    }

}
