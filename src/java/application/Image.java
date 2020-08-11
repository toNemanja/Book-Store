
package application;

import java.io.File;
import java.io.Serializable;
import java.sql.Blob;

public class Image implements Serializable{
    private int id;
    private Blob image;
    private File file;


    public Image(int id, File file) {
        this.id = id;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public Blob getImage() {
        return image;
    }

    public String getFile() {
        return file.getAbsolutePath();
    }

   
    
    
    
}
