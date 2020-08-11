
package articalDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;

public class ArticalUpdate {
    
    public static void updateAtical(int numberOfOrders, double totalArtical,int id){
        try{
            String update = "update artical set numberOfOrders = ?, total = ? where id = ?";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(update);
            ps.setInt(1, numberOfOrders);
            ps.setDouble(2, totalArtical);
            ps.setInt(3, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
