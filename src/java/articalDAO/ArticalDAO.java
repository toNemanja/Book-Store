package articalDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import cartDAO.CartDAO;

public class ArticalDAO {

    public static void insertArtical(String title, double price,double totalCart) {
        try {
            CartDAO.insertCart(totalCart);
            String insert = "insert into artical(title,price,total,cart_id) values(?,?,?,?)";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(insert); 
            ps.setString(1, title);
            ps.setDouble(2, price);
            ps.setDouble(3, price);
            ps.setInt(4, CartDAO.getAutoIncKeyFromApi());
            ps.executeUpdate();
            

        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
