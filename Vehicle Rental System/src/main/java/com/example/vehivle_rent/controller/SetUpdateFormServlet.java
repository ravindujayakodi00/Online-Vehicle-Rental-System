package com.example.vehivle_rent.controller;

import com.example.vehivle_rent.model.Customer;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/setupdate")
public class SetUpdateFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cusid = Integer.parseInt(request.getParameter("cusid"));

        Customer cus = null;
        try {
            cus = CustomerDButil.selectACustomer(cusid);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("cus", cus);
        RequestDispatcher rd = request.getRequestDispatcher("/update.jsp");
        rd.forward(request, response);
    }
}
