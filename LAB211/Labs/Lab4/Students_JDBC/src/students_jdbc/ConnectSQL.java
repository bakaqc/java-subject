package students_jdbc;

import java.sql.*;

public class ConnectSQL {

    private static String DBURL = "jdbc:mysql://localhost:3306/student";
    private static String USERNAME = "root";
    private static String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("Connect failure!");
            e.printStackTrace();
        }
        return conn;
    }

}
