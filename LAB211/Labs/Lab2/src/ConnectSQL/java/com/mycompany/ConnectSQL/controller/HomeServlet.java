package com.mycompany.hihi.controller;

import com.mycompany.hihi.db.JDBC;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            PrintWriter out = response.getWriter();

            Connection conn = JDBC.getConnection();

            PreparedStatement smt = conn.prepareStatement("select * from employee");

            ResultSet rs = smt.executeQuery();

            out.println("<table border=\"1\"><tr><td>ID</td><td>name</td><td>age</td><td>address</td></tr>");

            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getInt("age") + "</td><td>" + rs.getString("address") + "</td></tr>");
            }

            out.println("</table>");

            JDBC.closeConnection(conn);
        } catch (Exception ex) {

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
