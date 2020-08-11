
package userDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;


public class UserDeleteDAO {
     public static void deleteUser() {
        PreparedStatement st = null;
        try {
            String deleteUserOrder = "delete from book_store.user where id = " 
                    + UserDAO.getUserAutoIncKey();
            st = DataBaseConnection.get().prepareStatement(deleteUserOrder);
            st.executeUpdate(deleteUserOrder);

        } catch (Exception e) {
            System.err.println(e);
        }
    } 
}
