package se.maven.login.db;

import java.sql.*;

public class JDBC {

    private static String DBURL = "jdbc:mysql://localhost:3306/employee";
    private static String USERNAME = "root";
    private static String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connect MySQL successful!");
        } catch (Exception e) {
            System.out.println("Connect MySQL failure!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();

                System.out.println("Close MySQL successfully!");
            }
        } catch (SQLException ex) {
            System.err.println("Close MySQL failure!");
        }
    }

}
