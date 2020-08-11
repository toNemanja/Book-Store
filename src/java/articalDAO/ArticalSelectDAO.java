package articalDAO;

import cartDAO.CartDAO;
import application.Artical;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticalSelectDAO {

    private static List<Artical> articalList = new ArrayList<>();

    public static List<Artical> selectArticals() {
        ResultSet rs = null;
        try {
            articalList.clear();
            String selectArtical = "select * from artical where cart_id=" + CartDAO.getAutoIncKeyFromApi();
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(selectArtical);
            rs = ps.executeQuery(selectArtical);
            while (rs.next()) {
                int articalId = rs.getInt("id");
                String articalTitle = rs.getString("title");
                double articalPrice = rs.getDouble("price");
                int numberOfOrders = rs.getInt("numberOfOrders");
                double totalAmount = rs.getDouble("total");
                Artical artical = new Artical(articalId, articalTitle, articalPrice,numberOfOrders,totalAmount);
                articalList.add(artical);
                //probaj sa return generated key            
                  
            }
           
           

            return articalList;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    public static List<Artical> getArticalList() {
        return articalList;
    }

}
