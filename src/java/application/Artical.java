package application;

import java.io.Serializable;

public class Artical implements Serializable {

    private int id;
    private String title;
    private double price;
    private double total;
    private int numberOfOrder;


    public Artical(int id, String title, double price, int numberOfOrder, double total) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.numberOfOrder = numberOfOrder;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public double getTotal() {
        return total;
    }


    @Override
    public String toString() {
        return "Artical{" + "id=" + id + ", title=" + title + ", price=" + price + ", total=" + total + ", numberOfOrder=" + numberOfOrder + '}';
    }

}
