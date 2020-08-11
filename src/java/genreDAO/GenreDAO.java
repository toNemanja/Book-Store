
package genreDAO;

import application.Genre;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {
    private static List<Genre> genreList = new ArrayList<>();
       public static List<Genre> selectGenre() {
           ResultSet rs = null;
        try {
             genreList.clear(); 
            String select = "select * from book_store.genre"; 
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(select);          
            rs = ps.executeQuery(select);
            while(rs.next()){                
                int id = rs.getInt("id");
                String title = rs.getString("title");
                Genre genre = new Genre(id,title);
                genreList.add(genre);
            }
            return genreList;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
       
       public static List<Genre> getGenreList(){
           return genreList;
       }
}


/*  insert into books_genre(book_id,genre_id) values(bookDAO.generated key,  */