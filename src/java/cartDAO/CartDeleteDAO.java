package cartDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import userDAO.UserDAO;

public class CartDeleteDAO {

    public static void deleteArtical(int id) {
        PreparedStatement st = null;
        try {
            String deleteId = "delete from book_store.artical where id = " + id;
            st = DataBaseConnection.get().prepareStatement(deleteId);
            st.executeUpdate(deleteId);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
       public static void deleteAllArticals() {
        PreparedStatement st = null;
        try {
            String deleteId = "delete from book_store.artical where cart_id = " 
                    + CartDAO.getAutoIncKeyFromApi();
            st = DataBaseConnection.get().prepareStatement(deleteId);
            st.executeUpdate(deleteId);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void deleteCart() {
        PreparedStatement st = null;
        try {
            CartDAO.getCartList().clear();
            String deleteId = "delete from book_store.cart where user_id = " + UserDAO.getUserAutoIncKey();
            st = DataBaseConnection.get().prepareStatement(deleteId);
            st.executeUpdate(deleteId);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void updateCartTotal(double total) {
        PreparedStatement st = null;
        try {
            String updateArtical = "UPDATE cart SET total = " + total
                    + " where id =" + CartDAO.getAutoIncKeyFromApi();
            st = DataBaseConnection.get().prepareStatement(updateArtical);
            st.executeUpdate(updateArtical);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
