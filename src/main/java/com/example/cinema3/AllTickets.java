package com.example.cinema3;

public class AllTickets {
    private int id;
    private String movieSelection;
    private int amount;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;

    public AllTickets(int id, String movieSelection, int amount, String firstName, String lastName, int phoneNumber, String email) {
        this.id = id;
        this.movieSelection = movieSelection;
        this.amount = amount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie() {
        return movieSelection;
    }

    public void setMovie(String movieSelection) {
        this.movieSelection = movieSelection;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

        /*
        Getters and Setters retrieve data and saves it in the ticket array.

        source code https://www.geeksforgeeks.org/getter-and-setter-in-java/
        also, right click, generate, getters and setters
        */

}
