
import java.sql.*;

// Thực thi 1 transaction đơn giản sau
public class Main {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/java_web_33?useSSL=false";
        String USER_NAME = "root";
        String PASSWORD = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            String sql = "INSERT INTO products(name, made_in, status) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "Vay nu");
            statement.setString(2, "France");
            statement.setInt(3, 1);
            statement.executeUpdate();
            connection.close();
            System.out.println("Kết nối thành công");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}