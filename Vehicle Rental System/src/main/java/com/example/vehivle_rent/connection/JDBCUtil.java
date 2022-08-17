package com.example.vehivle_rent.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/vehiclerent";
        String user = "root";
        String Pass = "root1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,Pass);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
