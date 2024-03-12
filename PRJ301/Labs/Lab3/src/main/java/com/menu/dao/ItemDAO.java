package com.menu.dao;

import com.menu.JDBC.JDBC;
import com.menu.model.*;
import java.sql.*;
import java.util.*;

public class ItemDAO {

    public static List<Items> getAllCategory() {
        List<Items> list = new ArrayList<>();
        try {
            Connection c = JDBC.getConnection();

            String sql1 = "SELECT * FROM categories";

            PreparedStatement st = c.prepareStatement(sql1);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Items item = new Items();
                item.setId(rs.getInt("id"));
                item.setNameCategories(rs.getString("name_category"));
                item.setParentId(rs.getInt("parent_id"));
                list.add(item);

            }

            c.close();
        } catch (Exception e) {
        }

        System.out.println(list);
        return list;
    }

    public static int countAll() {
        int count = 0;

        try {
            Connection conn = JDBC.getConnection();

//          count all record in table categories
            PreparedStatement smt = conn.prepareStatement("SELECT COUNT(*) FROM categories");

            ResultSet rs = smt.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            JDBC.closeConnection(conn);
        } catch (SQLException ex) {

        }

        return count;
    }

    public static List<Items> pagingItem(int limit, int offset) {
        List<Items> list = new ArrayList<>();

        try {
            Connection conn = JDBC.getConnection();

//          get items from table categories with limit and offset
            PreparedStatement smt = conn.prepareStatement("SELECT * FROM categories ORDER BY id LIMIT ? OFFSET ?");
            smt.setInt(1, limit);
            smt.setInt(2, offset);

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                Items item = new Items();
                item.setId(rs.getInt("id"));
                item.setNameCategories(rs.getString("name_category"));
                item.setParentId(rs.getInt("parent_id"));
                list.add(item);
            }

            JDBC.closeConnection(conn);

        } catch (SQLException ex) {

        }

        return list;
    }

//    public static void main(String[] args) {
//        System.out.println(pagingItem(3, 0));
//    }
}
