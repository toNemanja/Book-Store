package application;

import java.io.Serializable;
import java.sql.Blob;

public class Book implements Serializable {

    private int id;
    private String title;
    private String description;
    private double price;
    private int imageId;

    public Book(int id, String title, String description, double price, int imageId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageId = imageId;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageId() {
        return imageId;
    }

  
    
    


}
