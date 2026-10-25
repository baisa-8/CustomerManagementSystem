package com.java.customer;

public class Customer {

    private int id;
    private String firstname;
    private String lastname;
    private char gender;

    public Customer() {
    }

    public Customer(int id, String firstname, String lastname, char gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " " + firstname + " " + lastname + " " + gender;
    }
}
