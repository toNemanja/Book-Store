package cartDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;

public class CartUpdateDAO {

    public static void updateTotal(int id,double total) {
        try {
                String updateTotalValue="update cart set total=? where id = ?";
                PreparedStatement ps = DataBaseConnection.get().prepareStatement(updateTotalValue);
                ps.setDouble(1, total);
                ps.setInt(2, id);
                ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
