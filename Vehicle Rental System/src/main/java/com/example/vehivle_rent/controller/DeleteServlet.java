package com.example.vehivle_rent.controller;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Boolean isDeleted = false;

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            isDeleted = CustomerDButil.deleteCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(isDeleted){
            String alert = "Customer Deleted Successfully";
            request.setAttribute("alert", alert);
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.forward(request, response);
        }else{
            out.println("<h1>Error While Deleting</h1>");
        }
    }

}
