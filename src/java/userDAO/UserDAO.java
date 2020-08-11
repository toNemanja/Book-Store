package userDAO;

import databaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class UserDAO {

    private static int userAutoIncKey = -1;

    public static void insertUser() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String insert = "insert into user() values ()";
            ps = DataBaseConnection.get().prepareStatement(insert, RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            while (rs.next()) {
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
