package cartDAO;

import application.Cart;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;
import userDAO.UserDAO;
import userDAO.UserDAO;

public class CartDAO {

    private static int autoIncKeyFromApi = -1;
    private static List<Cart> cartList = new ArrayList<>();

    public static void insertCart(double total) {
        ResultSet rs = null;
        try {
            if (cartList.isEmpty()) {
                System.out.println("insert in cart");
                UserDAO.insertUser();
                String insert = "insert into cart(user_id,total) values(?,?)";
                PreparedStatement ps = DataBaseConnection.get().prepareStatement(insert, RETURN_GENERATED_KEYS);
                ps.setInt(1, UserDAO.getUserAutoIncKey());
                ps.setDouble(2, total);
                ps.executeUpdate();
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    autoIncKeyFromApi = rs.getInt(1);
                    Cart cart = new Cart(autoIncKeyFromApi, total);
                    cartList.add(cart);
                }
            } else {
                //if(seesion.isValid) return cart
                String selectId = "SELECT id FROM book_store.cart where id=" + autoIncKeyFromApi;
                PreparedStatement ps = DataBaseConnection.get().prepareStatement(selectId);
                rs = ps.executeQuery();
                while (rs.next()) {
                    autoIncKeyFromApi = rs.getInt("id");
                    Cart cart = new Cart(autoIncKeyFromApi, total);
                    cartList.add(cart);
                }
                System.out.println("auto key: " + autoIncKeyFromApi);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static int getAutoIncKeyFromApi() {
        return autoIncKeyFromApi;
    }

    public static List<Cart> getCartList() {
        return cartList;
    }

}
