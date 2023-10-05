
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
            String sql = "UPDATE products SET name = ?, made_in = ?, status = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "Vay less");
            statement.setString(2, "My");
            statement.setInt(3, 0);
            statement.setInt(4, 6);
            statement.executeUpdate();
            connection.close();
            System.out.println("Kết nối thành công");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}