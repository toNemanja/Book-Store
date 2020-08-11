package databaseConnection;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataBaseConnection {
    private DataSource dataSource;
    private Connection conn;
    private static DataBaseConnection instance;

    public static Connection get() {
        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance.conn;
    }

    public DataBaseConnection() {
        try {
            InitialContext ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("jdbc/NemkeDB");
            conn = dataSource.getConnection(); 
        } catch (Exception ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }
}
