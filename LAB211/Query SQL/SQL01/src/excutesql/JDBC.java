package excutesql;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    private static String DBURL = "jdbc:mysql://localhost:3306/worker";
    private static String USERNAME = "root";
    private static String PASSWORD = "";

    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connect succesfully!");

        } catch (Exception e) {
            System.out.println("Connect failure!");
            e.printStackTrace();
        }
        return conn;
    }
}
