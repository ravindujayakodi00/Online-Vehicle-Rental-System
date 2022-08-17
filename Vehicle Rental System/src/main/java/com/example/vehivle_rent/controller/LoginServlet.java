package com.example.vehivle_rent.controller;

import com.example.vehivle_rent.model.Customer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String email = request.getParameter("Email");
        String password = request.getParameter("Password");

        if(CustomerDButil.validate(email, password)){
            List<Customer> cusDetails = null;
            try {
                cusDetails = CustomerDButil.getCustomer(email, password);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            request.setAttribute("cusDetails", cusDetails);
            RequestDispatcher dis = request.getRequestDispatcher("/useraccount.jsp");
            dis.forward(request,response);
        }else {
            String alert = "INVALID USERNAME OR PASSWORD";
            request.setAttribute("alert", alert);
            RequestDispatcher dis = request.getRequestDispatcher("/login.jsp");
            dis.forward(request,response);
        }
    }
}
