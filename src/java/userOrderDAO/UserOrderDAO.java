package userOrderDAO;

import userDAO.UserDAO;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserOrderDAO {
  private static int userAutoIncKey= -1;
    public static void insertUserOrder(String firstName,String lastName,String city,String adress,
            int phone) {
        ResultSet rs = null;
        try {
            String insertUserOrder ="insert into userorder(firstName,lastName,city,adress,phone,user_id)"
                     +"values(?,?,?,?,?,?)";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(insertUserOrder,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, city);
            ps.setString(4, adress);
            ps.setInt(5, phone);
            ps.setInt(6, UserDAO.getUserAutoIncKey());
            ps.executeUpdate(); 
            rs = ps.getGeneratedKeys();
            if(rs.next()){
                userAutoIncKey = rs.getInt(1);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    } 

    public static int getUserAutoIncKey() {
        return userAutoIncKey;
    }

    
}
