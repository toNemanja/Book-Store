
package bookDAO;

import application.Book;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SearchBarDAO {
    private static List<Book> bookSerachResult = new ArrayList<>();
    
    public static List<Book>search(String title){
        ResultSet rs=null;
        try{
            bookSerachResult.clear();
            String searchQuery="select * from books where title regexp '"+title+"'";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(searchQuery);
            rs = ps.executeQuery(searchQuery);
            while(rs.next()){
                 int id = rs.getInt("id");
                String bookTitle = rs.getString("title");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int imageId = rs.getInt("image_id");
                Book book = new Book(id,bookTitle,description,price,imageId);
                bookSerachResult.add(book);
            }
            return bookSerachResult;
        }catch(Exception e){
            System.err.println(e);
            return null;
        }
    }
}
