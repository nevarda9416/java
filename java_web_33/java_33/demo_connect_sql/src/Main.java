
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Thực thi các transaction đơn giản sau
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.findByName();
        main.deleteById();
    }

    public Connection openConnection() {
        String DB_URL = "jdbc:mysql://localhost:3306/java_web_33?useSSL=false";
        String USER_NAME = "root";
        String PASSWORD = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            return connection;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    public List<Product> findByName() {
        List<Product> productList = new ArrayList<>();
        Connection connection = openConnection();
        try {
            String sql = "SELECT * FROM products WHERE name LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
            statement.setString(1, "%" + scanner.nextLine() + "%");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Sản phẩm có tồn tại");
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setMade_in(resultSet.getString("made_in"));
                product.setStatus(resultSet.getInt("status"));
                productList.add(product);
                System.out.println(product.toString());
            } else {
                System.out.println("Sản phẩm không tồn tại");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return productList;
    }

    public void deleteById() {
        Connection connection = openConnection();
        try {
            String sql = "DELETE FROM products WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID sản phẩm cần xóa: ");
            statement.setInt(1, scanner.nextInt());
            int result = statement.executeUpdate();
            if (result == 1) {
                System.out.println("Xóa sản phẩm thành công");
            } else {
                System.out.println("ID không tồn tại. Xóa sản phẩm thất bại");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}