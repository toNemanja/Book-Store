package tempArticalDAO;

import application.TempArtical;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import userOrderDAO.UserOrderDAO;
import databaseConnection.DataBaseConnection;

public class TempArticalSelectDAO {

    private static List<TempArtical> tempArticalList = new ArrayList<>();

    public static List<TempArtical> selectTempArtical() {
        ResultSet rs = null;

        try {
            String selectTempArtical="select id,bookTitle,bookPrice,numberOfOrder,totalPerBook "
                    + "from tempartical where userOrder_id=" + UserOrderDAO.getUserAutoIncKey();                 
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(selectTempArtical);
            rs = ps.executeQuery(selectTempArtical);
            while(rs.next()){
                int id = rs.getInt("id");
                String bookTitle = rs.getString("bookTitle");
                double bookPrice = rs.getDouble("bookPrice");
                int numberOfOrder = rs.getInt("numberOfOrder");
                double totalPerBook = rs.getDouble("totalPerBook");
                TempArtical temp = new TempArtical(id, bookTitle, bookPrice, numberOfOrder,totalPerBook);
                tempArticalList.add(temp);
            }
            return tempArticalList;
                   
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    public static List<TempArtical> getTempArticalList() {
        return tempArticalList;
    }
    
}
