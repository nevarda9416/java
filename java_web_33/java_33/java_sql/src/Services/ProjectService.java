package Services;

import Models.Project;
import Utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProjectService implements BaseService<Project> {
    // 1/ Thêm mới dự án
    public void save() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "INSERT INTO projects(code, name, description, start_date, end_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập mã dự án: ");
            Scanner scannerCode = new Scanner(System.in);
            String code = scannerCode.nextLine();
            System.out.print("Nhập tên dự án: ");
            Scanner scannerName = new Scanner(System.in);
            String name = scannerName.nextLine();
            System.out.print("Nhập mô tả dự án: ");
            Scanner scannerDescription = new Scanner(System.in);
            String description = scannerDescription.nextLine();
            System.out.print("Nhập ngày bắt đầu dự án: ");
            Scanner scannerStartDate = new Scanner(System.in);
            String startDate = scannerStartDate.nextLine();
            System.out.print("Nhập ngày kết thúc dự án: ");
            Scanner scannerEndDate = new Scanner(System.in);
            String endDate = scannerEndDate.nextLine();
            statement.setString(1, code);
            statement.setString(2, name);
            statement.setString(3, description);
            statement.setString(4, startDate);
            statement.setString(5, endDate);
            statement.executeUpdate();
            System.out.print("Thêm mới dự án thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 2/ Cập nhật dự án
    public void update() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "UPDATE projects SET name = ?, description = ?, start_date = ?, end_date = ? WHERE code = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập mã dự án: ");
            Scanner scannerCode = new Scanner(System.in);
            String code = scannerCode.nextLine();
            System.out.print("Nhập tên dự án: ");
            Scanner scannerName = new Scanner(System.in);
            String name = scannerName.nextLine();
            System.out.print("Nhập mô tả dự án: ");
            Scanner scannerDescription = new Scanner(System.in);
            String description = scannerDescription.nextLine();
            System.out.print("Nhập ngày bắt đầu dự án: ");
            Scanner scannerStartDate = new Scanner(System.in);
            String startDate = scannerStartDate.nextLine();
            System.out.print("Nhập ngày kết thúc dự án: ");
            Scanner scannerEndDate = new Scanner(System.in);
            String endDate = scannerEndDate.nextLine();
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setString(3, startDate);
            statement.setString(4, endDate);
            statement.setString(5, code);
            int result = statement.executeUpdate();
            if (result == 1) {
                System.out.print("Sửa dự án thành công");
            } else {
                System.out.println("Sửa dự án không thành công. Mã dự án không tồn tại.");
            }
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 3/ Xóa dự án
    public void deleteById() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "DELETE FROM projects WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID dự án cần xóa: ");
            statement.setInt(1, scanner.nextInt());
            int result = statement.executeUpdate();
            if (result == 1) {
                System.out.println("Xóa dự án thành công");
            } else {
                System.out.println("ID không tồn tại. Xóa dự án thất bại");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 4/ Hiển thị danh sách dự án (sắp xếp tăng hoặc giảm dần)
    public void getListsOrderByName() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn danh sách tăng hay giảm (up/down)");
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.openConnection();
        String sql = "";
        if (Objects.equals(scanner.nextLine(), "up")) {
            sql += "SELECT * FROM projects ORDER BY name ASC";
        } else {
            sql += "SELECT * FROM projects ORDER BY name DESC";
        }
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Project project = new Project();
            project.setCode(resultSet.getString("code"));
            project.setName(resultSet.getString("name"));
            project.setDescription(resultSet.getString("description"));
            project.setStart_date(resultSet.getString("start_date"));
            project.setEnd_date(resultSet.getString("end_date"));
            System.out.println(project.toString());
        }
    }

    // 9/ Thêm nhân viên vào trong dự án
    public void assignEmployee() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "INSERT INTO employees_projects(project_id, employee_id) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Nhập mã dự án: ");
            Scanner scannerProjectCode = new Scanner(System.in);
            int projectID = this.findByCode(scannerProjectCode.nextLine());
            System.out.print("Nhập mã nhân viên: ");
            EmployeeService employeeService = new EmployeeService();
            Scanner scannerEmployeeCode = new Scanner(System.in);
            int employeeID = employeeService.findByCode(scannerEmployeeCode.nextLine());
            statement.setInt(1, projectID);
            statement.setInt(2, employeeID);
            statement.executeUpdate();
            System.out.print("Thêm nhân viên vào dự án thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 10/ Thống kê nhân viên trong dự án
    public void getStatistic() throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.openConnection();
        String sql = "SELECT projects.code as code, COUNT(employees_projects.employee_id) AS amount_employees FROM projects INNER JOIN employees_projects WHERE employees_projects.project_id = projects.id GROUP BY projects.code";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Thống kê nhân viên trong từng dự án");
            System.out.println("Mã dự án: " + resultSet.getString("code") + ". Số lượng nhân viên: " + resultSet.getString("amount_employees") + " người.");
        }
    }

    // Tìm kiếm dự án
    public int findByCode(String code) {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "SELECT id FROM projects WHERE code LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + code + "%");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("id");
            } else {
                return 0;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
    }
}

