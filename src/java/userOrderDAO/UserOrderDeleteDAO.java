
package userOrderDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import userDAO.UserDAO;


public class UserOrderDeleteDAO {
     public static void deleteUserOrder() {
        PreparedStatement st = null;
        try {
            String deleteUserOrder = "delete from book_store.userorder where user_id = " 
                    + UserDAO.getUserAutoIncKey();
            st = DataBaseConnection.get().prepareStatement(deleteUserOrder);
            st.executeUpdate(deleteUserOrder);

        } catch (Exception e) {
            System.err.println(e);
        }
    } 
} 
