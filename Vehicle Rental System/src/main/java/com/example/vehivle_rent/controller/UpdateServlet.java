package com.example.vehivle_rent.controller;

import com.example.vehivle_rent.model.Customer;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("cusid"));
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");

        boolean istrue;

        Customer cus = new Customer(id, fname, lname, email, pass);

        istrue = CustomerDButil.updatecustomer(cus);

        if (istrue == true) {
            String alert = "User updated Successfully";
            request.setAttribute("alert",alert);
            RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
            dis.forward(request, response);
        } else {
            out.println("<h3>Error While Updating</h3>");
        }
    }
}
