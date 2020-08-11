
package application;

import java.io.Serializable;

public class Genre implements Serializable{
    private int id;
    private String title;
    
    public Genre(int id, String title){
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
 
    
}
