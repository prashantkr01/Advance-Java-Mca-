package jdbcmysql;

import java.sql.*;

public class StudentDB {

    public static void main(String[] args) {

        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "";

        String create_table = """
            CREATE TABLE IF NOT EXISTS student(
                id INT PRIMARY KEY AUTO_INCREMENT,
                name VARCHAR(50) NOT NULL,
                course VARCHAR(50),
                marks DECIMAL(10,2)
            )
        """;

        try {
            Class.forName(jdbc_driver);

            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();
            stmt.execute(create_table);

            System.out.println("Table created successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }
    }
}