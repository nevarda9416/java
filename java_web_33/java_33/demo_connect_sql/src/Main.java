
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/java_web_33?useSSL=false";
        String USER_NAME = "root";
        String PASSWORD = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            String sql = "SELECT * FROM products";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setMade_in(resultSet.getString("made_in"));
                product.setStatus(resultSet.getInt("status"));
                System.out.println(product.toString());
                System.out.println("");
            }
            System.out.println("Kết nối thành công");
        } catch (Exception exception) {

        }
    }
}