package bookDAO;

import application.Book;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
 private static List<Book> bookList = new ArrayList<>();
    public  static void selectBooks() {
       
        ResultSet rs = null;

        try {
            bookList.clear();
            String bookAndImage="SELECT * FROM book_store.books as b join image"
            + " as i where b.image_id = i.id";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(bookAndImage);
            rs = ps.executeQuery(bookAndImage);
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int imageId = rs.getInt("image_id");
                Book book = new Book(id,title,description,price,imageId);
                bookList.add(book);
                
            } 
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }

    public static List<Book> getBookList() {
        return bookList;
    }
    
}
