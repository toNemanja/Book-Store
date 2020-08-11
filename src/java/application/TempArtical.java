package application;

import java.io.Serializable;

public class TempArtical implements Serializable{
    private int id;
    private String bookTitle;
    private double  bookPrice;
    private int numberOfOrder;
    private double totalPerBook;

    public TempArtical(int id,String bookTitle, double bookPrice, int numberOfOrder,
            double totalPerBook) {
        this.id=id;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.numberOfOrder = numberOfOrder;
        this.totalPerBook = totalPerBook;
    }

    public int getId() {
        return id;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }

    public double  getBookPrice() {
        return bookPrice;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public double getTotalPerBook() {
        return totalPerBook;
    }

    @Override
    public String toString() {
        return "TempArtical{" + "id=" + id + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", numberOfOrder=" + numberOfOrder + ", totalPerBook=" + totalPerBook + '}';
    }
    
    

}
