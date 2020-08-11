package imageDAO;

import application.Image;
import databaseConnection.DataBaseConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ImageSelect implements Serializable{

    private static List<Image> imageList = new ArrayList<>();

    public static List<Image> selectImages() {
        ResultSet rs = null;

        try {
            imageList.clear();//join sa book
            String selectImages = "select * from image";
            PreparedStatement ps = DataBaseConnection.get().prepareStatement(selectImages);
            rs = ps.executeQuery(selectImages);

            while (rs.next()) {

                int idImage = rs.getInt("id");
                Blob viewImage = rs.getBlob("image");
                File targetFile = new File("C:\\Users\\Nemanja\\Documents\\NetBeansProjects\\FinalShop\\web\\Images\\book" + idImage + ".png");
                OutputStream outStream = new FileOutputStream(targetFile);
                byte[] buffer = new byte[1024];
                InputStream input = rs.getBinaryStream("image");
                while (input.read(buffer) > 0) {
                    outStream.write(buffer);
                }
                System.out.println("File: " + targetFile.getAbsolutePath());


                Image image = new Image(idImage, targetFile);
                imageList.add(image);
            }
            return imageList;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

}
