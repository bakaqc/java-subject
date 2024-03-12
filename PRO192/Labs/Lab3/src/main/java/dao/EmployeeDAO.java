package dao;

import java.sql.*;
import java.util.*;
import db.JDBC;
import model.Employee;

public class EmployeeDAO implements DAO<Employee> {

    private static final EmployeeDAO instance = new EmployeeDAO();

    public static EmployeeDAO getInstance() {
        return instance;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();
            PreparedStatement smt = c.prepareStatement("SELECT * FROM employee");
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                int ID = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                list.add(new Employee(ID, name, age, address));
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
        }
        return list;
    }

    @Override
    public Optional<Employee> getId(int ID) {
        Employee employee = null;
        try {
            Connection conn = JDBC.getConnection();
            PreparedStatement smt = conn.prepareStatement("SELECT * FROM employee WHERE id = ?");
            smt.setInt(1, ID);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                employee = new Employee(ID, name, age, address);
            }
            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
        return Optional.ofNullable(employee);
    }

    @Override
    public void insert(Employee obj) {
        Connection conn = JDBC.getConnection();
        try {
            PreparedStatement smt = conn.prepareStatement("INSERT INTO employee(name, age, address) VALUES (?, ?, ?)");
            smt.setString(1, obj.getName());
            smt.setInt(2, obj.getAge());
            smt.setString(3, obj.getAddress());
            smt.executeUpdate();
            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(Employee obj) {
        Connection conn = JDBC.getConnection();
        try {
            PreparedStatement smt = conn.prepareStatement("UPDATE employee SET name = ?, age = ?, address = ? WHERE id = ?");
            smt.setString(1, obj.getName());
            smt.setInt(2, obj.getAge());
            smt.setString(3, obj.getAddress());
            smt.setInt(4, obj.getId());
            smt.executeUpdate();
            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(int ID) {
        Connection conn = JDBC.getConnection();
        try {
            PreparedStatement smt = conn.prepareStatement("DELETE FROM employee WHERE id = ?");
            smt.setInt(1, ID);

            smt.executeUpdate();

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {
        }
    }

}
