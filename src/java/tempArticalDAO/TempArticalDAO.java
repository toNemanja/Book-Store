
package tempArticalDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import userOrderDAO.UserOrderDAO;

public class TempArticalDAO {
    private static int tempArticalAutoIncKey= -1;
    public static void insertUserOrder(String bookTitle,double bookPrice,int numberOfOrder,
            double totalPerBook){
        ResultSet rs = null;
        try {
            String insertUserOrder ="insert into tempartical(bookTitle,bookPrice,numberOfOrder,totalPerBook,"
                    + "userOrder_id) values(?,?,?,?,?)";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(insertUserOrder,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bookTitle);
            ps.setDouble(2, bookPrice);
            ps.setInt(3, numberOfOrder);
            ps.setDouble(4, totalPerBook);
            ps.setInt(5, UserOrderDAO.getUserAutoIncKey());
            ps.executeUpdate(); 
            rs = ps.getGeneratedKeys();
            if(rs.next()){
                tempArticalAutoIncKey = rs.getInt(1);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static int getTempArticalAutoIncKey() {
        return tempArticalAutoIncKey;
    }
    
    
}
