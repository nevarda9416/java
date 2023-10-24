package com.example.demo_servlet.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    public Connection openConnection() {
        String DB_URL = "jdbc:mysql://localhost:3306/java_web_33?useSSL=false";
        String USER_NAME = "root";
        String PASSWORD = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        DBContext dbContext = new DBContext();
        Connection connection = dbContext.openConnection();
        System.out.println(connection);
    }
}

