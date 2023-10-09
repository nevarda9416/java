package Services;

import Utils.DatabaseConnection;
import Models.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ProductService implements BaseService<Product> {
    // 1/ Thêm mới sản phẩm
    public void save() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "INSERT INTO products(name, made_in, status) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập tên sản phẩm: ");
            Scanner scannerName = new Scanner(System.in);
            String name = scannerName.nextLine();
            System.out.print("Nhập nơi sản xuất: ");
            Scanner scannerMadeIn = new Scanner(System.in);
            String madeIn = scannerMadeIn.nextLine();
            System.out.print("Nhập trạng thái: ");
            Scanner scannerStatus = new Scanner(System.in);
            int status = scannerStatus.nextInt();
            statement.setString(1, name);
            statement.setString(2, madeIn);
            statement.setInt(3, status);
            statement.executeUpdate();
            System.out.print("Thêm mới sản phẩm thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 2/ Cập nhật sản phẩm
    public void update() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "UPDATE products SET name = ?, made_in = ?, status = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập ID sản phẩm: ");
            Scanner scannerId = new Scanner(System.in);
            int id = scannerId.nextInt();
            System.out.print("Nhập tên sản phẩm: ");
            Scanner scannerName = new Scanner(System.in);
            String name = scannerName.nextLine();
            System.out.print("Nhập nơi sản xuất: ");
            Scanner scannerMadeIn = new Scanner(System.in);
            String madeIn = scannerMadeIn.nextLine();
            System.out.print("Nhập trạng thái: ");
            Scanner scannerStatus = new Scanner(System.in);
            int status = scannerStatus.nextInt();
            statement.setString(1, name);
            statement.setString(2, madeIn);
            statement.setInt(3, status);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.out.print("Sửa sản phẩm thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 3/ Tìm kiếm sản phẩm
    public void findByName() {
        List<Product> productList = new ArrayList<>();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
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
    }

    // 4/ Xóa sản phẩm
    public void deleteById() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
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

    // 5/ Hiển thị danh sách sản phẩm (sắp xếp tăng hoặc giảm dần)
    public void getListsOrderByName() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn danh sách tăng hay giảm (up/down)");
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.openConnection();
        String sql = "";
        if (Objects.equals(scanner.nextLine(), "up")) {
            sql += "SELECT * FROM products ORDER BY name ASC";
        } else {
            sql += "SELECT * FROM products ORDER BY name DESC";
        }
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            product.setMade_in(resultSet.getString("made_in"));
            product.setStatus(resultSet.getInt("status"));
            System.out.println(product.toString());
            System.out.println();
        }
    }
}
