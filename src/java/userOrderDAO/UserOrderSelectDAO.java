
package userOrderDAO;

import application.UserOrder;
import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserOrderSelectDAO {
    private static List<UserOrder> userOrderList = new ArrayList<>();
    public static List<UserOrder>  selectUserOrder(){
        ResultSet rs = null;
        try{
            String selectUser = "Select id,firstName,lastName,city,adress,phone from userOrder where id="
                    + UserOrderDAO.getUserAutoIncKey();
               PreparedStatement ps = DataBaseConnection.get().prepareStatement(selectUser);
               rs = ps.executeQuery(selectUser);           
               while(rs.next()){
                int id = rs.getInt("id");
                String fName = rs.getString("firstName");
                String lName = rs.getString("lastName");
                String userCity = rs.getString("city");
                String userAdress = rs.getString("adress");
                int userPhone = rs.getInt("phone");
                UserOrder userOrder = new UserOrder(id,fName,lName,userCity,userAdress,userPhone);
                userOrderList.add(userOrder);
            }
               return userOrderList;
        }catch(Exception e){
            System.err.println(e);
            return null;
        }
    }

    public static List<UserOrder> getUserOrderList() {
        return userOrderList;
    }
    

    
}
