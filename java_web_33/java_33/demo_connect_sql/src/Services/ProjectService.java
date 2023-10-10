package Services;

import Models.Employee_Project;
import Models.Project;
import Utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            statement.executeUpdate();
            System.out.print("Sửa dự án thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 3/ Tìm kiếm dự án
    public void findByName() {
        List<Project> projectList = new ArrayList<>();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "SELECT * FROM projects WHERE name LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên dự án cần tìm kiếm: ");
            statement.setString(1, "%" + scanner.nextLine() + "%");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Dự án có tồn tại");
                Project project = new Project();
                project.setCode(resultSet.getString("code"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setStart_date(resultSet.getString("start_date"));
                project.setEnd_date(resultSet.getString("end_date"));
                projectList.add(project);
                System.out.println(project.toString());
            } else {
                System.out.println("Dự án không tồn tại");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 4/ Xóa dự án
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

    // 5/ Hiển thị danh sách dự án (sắp xếp tăng hoặc giảm dần)
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
            System.out.println();
        }
    }

    public void assignEmployee() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.openConnection();
            String sql = "INSERT INTO employees_projects(project_id, employee_id) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            System.out.print("Nhập ID dự án: ");
            Scanner scannerProjectID = new Scanner(System.in);
            int projectID = scannerProjectID.nextInt();

            System.out.print("Nhập ID nhân viên: ");
            Scanner scannerEmployeeID = new Scanner(System.in);
            int employeeID = scannerEmployeeID.nextInt();

            statement.setInt(1, projectID);
            statement.setInt(2, employeeID);
            statement.executeUpdate();
            System.out.print("Thêm nhân viên vào dự án thành công");
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

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
}

