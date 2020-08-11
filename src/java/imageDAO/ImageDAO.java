package imageDAO;

import application.Image;
import databaseConnection.DataBaseConnection;
import java.io.File;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Part;

public class ImageDAO {

    private static List<Image> imageList = new ArrayList<>();
    private static int autoIncKeyFromApi = -1;

    public static void insertImage(Part filePart) throws Exception {
        ResultSet rs = null;
        int row = 0;
        InputStream inputStream = null;
        try {
            String insertImage = ("insert into image(image) values(?)");
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(insertImage,
            RETURN_GENERATED_KEYS);
            if (filePart != null) {
                // obtains input stream of the upload file
                inputStream = filePart.getInputStream();

            }
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBlob(1, inputStream);
            }
            row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("Picture uploaded");
            }
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                autoIncKeyFromApi = rs.getInt(1);

            }
        } catch (Exception e) {
            System.err.println(e);

        }
    }

    public static int getAutoIncKeyFromApi() {
        return autoIncKeyFromApi;
    }

}
