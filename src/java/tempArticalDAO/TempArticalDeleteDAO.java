
package tempArticalDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import userOrderDAO.UserOrderDAO;

public class TempArticalDeleteDAO {
    
      public static void deleteAllTempArticals() {
        PreparedStatement st = null;
        try { 
            String deleteAllTempArtical = "delete from book_store.tempartical where userOrder_id = " 
                    + UserOrderDAO.getUserAutoIncKey();
            st = DataBaseConnection.get().prepareStatement(deleteAllTempArtical);
            st.executeUpdate(deleteAllTempArtical);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
