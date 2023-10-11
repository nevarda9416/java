package Services;

import Models.Project;
import Utils.DatabaseConnection;
import Models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EmployeeService implements BaseService<Employee> {
    // 1/ Thêm mới nhân viên
    public void save() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "INSERT INTO employees(code, fullname, address, telephone, gender, age) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập mã nhân viên: ");
            Scanner scannerCode = new Scanner(System.in);
            String code = scannerCode.nextLine();
            System.out.print("Nhập họ tên nhân viên: ");
            Scanner scannerFullName = new Scanner(System.in);
            String fullname = scannerFullName.nextLine();
            System.out.print("Nhập địa chỉ nhân viên: ");
            Scanner scannerAddress = new Scanner(System.in);
            String address = scannerAddress.nextLine();
            System.out.print("Nhập số điện thoại nhân viên: ");
            Scanner scannerTelephone = new Scanner(System.in);
            String telephone = scannerTelephone.nextLine();
            System.out.print("Nhập giới tính nhân viên: ");
            Scanner scannerGender = new Scanner(System.in);
            String gender = scannerGender.nextLine();
            System.out.print("Nhập tuổi nhân viên: ");
            Scanner scannerAge = new Scanner(System.in);
            int age = scannerAge.nextInt();
            statement.setString(1, code);
            statement.setString(2, fullname);
            statement.setString(3, address);
            statement.setString(4, telephone);
            statement.setString(5, gender);
            statement.setInt(6, age);
            statement.executeUpdate();
            System.out.print("Thêm mới nhân viên thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 2/ Cập nhật nhân viên
    public void update() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "UPDATE employees SET fullname = ?, address = ?, telephone = ?, gender = ?, age = ? WHERE code = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập mã nhân viên: ");
            Scanner scannerCode = new Scanner(System.in);
            String code = scannerCode.nextLine();
            System.out.print("Nhập họ tên nhân viên: ");
            Scanner scannerFullName = new Scanner(System.in);
            String fullname = scannerFullName.nextLine();
            System.out.print("Nhập địa chỉ nhân viên: ");
            Scanner scannerAddress = new Scanner(System.in);
            String address = scannerAddress.nextLine();
            System.out.print("Nhập số điện thoại nhân viên: ");
            Scanner scannerTelephone = new Scanner(System.in);
            String telephone = scannerTelephone.nextLine();
            System.out.print("Nhập giới tính nhân viên: ");
            Scanner scannerGender = new Scanner(System.in);
            String gender = scannerGender.nextLine();
            System.out.print("Nhập tuổi nhân viên: ");
            Scanner scannerAge = new Scanner(System.in);
            int age = scannerAge.nextInt();
            statement.setString(1, fullname);
            statement.setString(2, address);
            statement.setString(3, telephone);
            statement.setString(4, gender);
            statement.setInt(5, age);
            statement.setString(6, code);
            statement.executeUpdate();
            System.out.print("Sửa nhân viên thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 3/ Tìm kiếm nhân viên
    public String findByCode(String code) {
        List<Project> projectList = new ArrayList<>();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "SELECT id FROM employees WHERE code LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + code + "%");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("id");
            } else {
                return null;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    // 4/ Xóa nhân viên
    public void deleteById() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "DELETE FROM employees WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID nhân viên cần xóa: ");
            statement.setInt(1, scanner.nextInt());
            int result = statement.executeUpdate();
            if (result == 1) {
                System.out.println("Xóa nhân viên thành công");
            } else {
                System.out.println("ID không tồn tại. Xóa nhân viên thất bại");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 5/ Hiển thị danh sách nhân viên (sắp xếp tăng hoặc giảm dần)
    public void getListsOrderByName() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn danh sách tăng hay giảm (up/down)");
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.openConnection();
        String sql = "";
        if (Objects.equals(scanner.nextLine(), "up")) {
            sql += "SELECT * FROM employees ORDER BY firstname ASC";
        } else {
            sql += "SELECT * FROM employees ORDER BY firstname DESC";
        }
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Employee employee = new Employee();
            employee.setFullname(resultSet.getString("fullname"));
            employee.setAddress(resultSet.getString("address"));
            employee.setTelephone(resultSet.getString("telephone"));
            employee.setGender(resultSet.getString("gender"));
            employee.setAge(resultSet.getInt("age"));
            System.out.println(employee.toString());
        }
    }
}

