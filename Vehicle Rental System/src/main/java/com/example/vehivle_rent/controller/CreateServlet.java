package com.example.vehivle_rent.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean istrue;

        istrue = CustomerDButil.insertcustomer(fname,lname,email,password);

        if(istrue==true){
            String alert = "New User Created";
            request.setAttribute("alert", alert);
            RequestDispatcher dis = request.getRequestDispatcher("/login.jsp");
            dis.forward(request,response);
        }
        else {
            out.println("<h1>Error Creating a User</h1>");
        }
    }
}
