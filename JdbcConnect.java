
import java.sql.*;

public class JdbcConnect {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to: " + conn.getCatalog());
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println("Database: " + metaData.getDatabaseProductName());
            System.out.println("Version: " + metaData.getDatabaseProductVersion());
            conn.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
