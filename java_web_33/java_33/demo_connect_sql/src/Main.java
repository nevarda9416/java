
import java.sql.*;
import java.util.Scanner;

// Thực thi 1 transaction đơn giản sau
public class Main {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/java_web_33?useSSL=false";
        String USER_NAME = "root";
        String PASSWORD = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            String sql = "SELECT * FROM products WHERE name LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
            statement.setString(1, "%" + scanner.nextLine() + "%");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Sản phẩm có tồn tại");
            } else {
                System.out.println("Sản phẩm không tồn tại");
            }
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}