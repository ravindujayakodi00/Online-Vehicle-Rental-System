package com.example.vehivle_rent.controller;

import com.example.vehivle_rent.connection.JDBCUtil;
import com.example.vehivle_rent.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDButil {

    public static List<Customer> getCustomer(String email, String password) throws SQLException, ClassNotFoundException {
        ArrayList<Customer> customer = new ArrayList<>();
        String SELECT_CUSTOMER = "select * from customer where email='" + email + "' and passowrd = '" + password + "'";

        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(SELECT_CUSTOMER)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                String uEmail = rs.getString(4);
                String uPassword = rs.getString(5);

                Customer cus = new Customer(id, fname, lname, uEmail, uPassword);
                customer.add(cus);
            }
        }
        return customer;
    }

    public static Boolean validate(String email, String password) {
        Boolean isTrure = false;
        String SELECT_CUSTOMER = "select * from customer where email='" + email + "' and passowrd = '" + password + "'";
        //Validate
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(SELECT_CUSTOMER)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                isTrure = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isTrure;
    }

    public static Customer selectACustomer(int cusid) throws SQLException {
        Customer cus = null;
        String SELECT_A_CUSTOMER = "SELECT * FROM customer where cusid = '" + cusid + "'";

        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(SELECT_A_CUSTOMER)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int custid = rs.getInt("cusid");
                String fname = rs.getString("cusfname");
                String lname = rs.getString("cuslname");
                String email = rs.getString("email");
                String pass = rs.getString("passowrd");

                cus = new Customer(custid, fname, lname, email, pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cus;
    }

    public static boolean updatecustomer(Customer cus) {
        boolean issuccess = false;
        String UPDATE_CUSTOMER = "update customer set cusfname ='" + cus.getFname() + "',cuslname ='" + cus.getLname() + "',email ='" + cus.getEmail() + "',passowrd ='" + cus.getPassword() + "' where cusid='" + cus.getId() + "'";

        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(UPDATE_CUSTOMER)) {
            if (ps.executeUpdate() > 0) {
                issuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return issuccess;
    }

    public static boolean insertcustomer(String fname, String lname, String email, String password) {
        boolean issuccess = false;
        String INSERT_CUSTOMER = "insert into customer values(0,'" + fname + "','" + lname + "','" + email + "','" + password +"')";

        try(Connection con = JDBCUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER)) {

            if (ps.executeUpdate() > 0) {
                issuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return issuccess;
    }

    public static boolean deleteCustomer(int id) throws SQLException {
        boolean isDeleted = false;
        String DELETE_CUSTOMER = "DELETE FROM customer WHERE cusid = '"+id+"'";

        try(Connection con = JDBCUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(DELETE_CUSTOMER)){

            if(ps.executeUpdate() > 0){
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}

