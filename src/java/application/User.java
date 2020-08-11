package application;

import java.io.Serializable;

public class User implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String adress;
    private int phone;

    public User(int id, String firstName, String lastName, String city, String adress, int phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.adress = adress;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

}
