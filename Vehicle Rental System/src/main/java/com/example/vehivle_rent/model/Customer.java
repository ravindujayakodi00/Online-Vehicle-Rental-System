package com.example.vehivle_rent.model;

public class Customer {
    private int id;

    private String fname;

    private String lname;

    private String email;

    private  String password;

    public Customer(int id, String fname, String lname, String email, String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
