package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection openConnection() {
        String DB_URL = "jdbc:mysql://localhost:3306/java_web_33?useSSL=false";
        String USER_NAME = "root";
        String PASSWORD = "admin";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
