package sql;

import java.sql.*;

public class Main {

    public static void q1() {

        try {
            String SQL_Q1 = "SELECT FIRST_NAME AS WORKER_NAME FROM worker";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q1);

            ResultSet rs = stm.executeQuery();

            System.out.println("WORKER_NAME");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q2() {

        try {
            String SQL_Q2 = "SELECT UPPER(FIRST_NAME) FROM worker";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q2);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q3() {

        try {
            String SQL_Q3 = "SELECT DISTINCT DEPARTMENT FROM worker";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q3);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q4() {

        try {
            String SQL_Q4 = "SELECT SUBSTRING(FIRST_NAME, 1, 3) FROM worker";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q4);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q5() {

        try {
            String SQL_Q5 = "SELECT INSTR(FIRST_NAME, 'a') FROM worker WHERE FIRST_NAME = 'Amitabh'";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q5);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q6() {

        try {
            String SQL_Q6 = "SELECT RTRIM(FIRST_NAME) FROM worker;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q6);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q7() {

        try {
            String SQL_Q7 = "SELECT LTRIM(DEPARTMENT) FROM worker;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q7);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q8() {

        try {
            String SQL_Q8 = "SELECT REPLACE(FIRST_NAME, 'a', 'A') FROM worker;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q8);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q9() {

        try {
            String SQL_Q9 = "SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) FROM worker;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q9);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q10() {

        try {
            String SQL_Q10 = "SELECT * FROM worker ORDER BY FIRST_NAME ASC, DEPARTMENT DESC;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q10);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q11() {

        try {
            String SQL_Q11 = "SELECT * FROM worker WHERE FIRST_NAME IN ('Vipul', 'Satish');";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q11);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q12() {

        try {
            String SQL_Q12 = "SELECT * FROM worker WHERE FIRST_NAME NOT IN ('Vipul', 'Satish');";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q12);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q13() {

        try {
            String SQL_Q13 = "SELECT * FROM worker WHERE DEPARTMENT = 'Admin';";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q13);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q14() {

        try {
            String SQL_Q14 = "SELECT * FROM worker WHERE FIRST_NAME LIKE '%a%';";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q14);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q15() {

        try {
            String SQL_Q15 = "SELECT * FROM worker WHERE FIRST_NAME LIKE '%a';";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q15);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q16() {

        try {
            String SQL_Q16 = "SELECT * FROM worker WHERE FIRST_NAME LIKE '______h';";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q16);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q17() {

        try {
            String SQL_Q17 = "SELECT * FROM worker WHERE SALARY BETWEEN 100000 AND 500000;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q17);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }
    }

    public static void q18() {

        try {
            String SQL_Q18 = "SELECT * FROM worker WHERE SALARY IN (SELECT SALARY FROM worker GROUP BY SALARY HAVING COUNT(*) > 1 );";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q18);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q19() {

        try {
            String SQL_Q19 = "SELECT MAX(SALARY) FROM worker WHERE SALARY < (SELECT MAX(SALARY) FROM worker)";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q19);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q20() {

        try {
            String SQL_Q20 = "SELECT MAX(SALARY) FROM worker WHERE SALARY < (SELECT MAX(SALARY) FROM worker)";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q20);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q21() {

        try {
            String SQL_Q21 = "SELECT * FROM worker w JOIN title t ON w.WORKER_ID = t.WORKER_REF_ID WHERE WORKER_TITLE = 'Manager' ORDER BY WORKER_ID ASC";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q21);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q22() {

        try {
            String SQL_Q22 = "SELECT w1.* FROM worker w1 JOIN worker w2 ON w1.SALARY = w2.SALARY WHERE w1.WORKER_ID <> w2.WORKER_ID ORDER BY WORKER_ID ASC;";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q22);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q23() {

        try {
            String SQL_Q23 = "SELECT MAX(SALARY) AS 'Second highest salary' FROM worker WHERE SALARY < (SELECT MAX(SALARY) FROM worker);";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q23);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q24() {

        try {
            String SQL_Q24 = "WITH NewTable AS ( SELECT * FROM worker UNION ALL SELECT * FROM worker ) SELECT * FROM NewTable ORDER BY WORKER_ID;";
            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q24);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void q25() {

        try {
            String SQL_Q25 = "SELECT * FROM worker INTERSECT SELECT * FROM title";

            Connection conn = JDBC.getConnection();

            PreparedStatement stm = conn.prepareStatement(SQL_Q25);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) {
        q23();
    }
}
