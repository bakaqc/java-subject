/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.s2.maven.login.v1.Pages;

import fu.s2.maven.login.v1.Services.LoginServices;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author springTran
 */
public class LoginPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginPage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Content-Type", "text/xml; charset=UTF-8");
        try {
            LoginServices service = new LoginServices();
            Connection conn = null;
            try {
                conn = service.initializeDatabase();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            //here sonoo is database name, root is username and password
            Statement stmt = conn.createStatement();
            String tables = "<style type='text/css'>table,th,td{border:1px solid black;}</style><body><h2>AbasicHTMLtable</h2>";
            tables += "<table style='width:40%'>";
            tables += "<tr><th>name</th><th>age</th><th>address</th></tr>";
            ResultSet rs = stmt.executeQuery("select * from fu_info order by id desc limit 10;");
            while (rs.next()) {
                tables += "<tr>";
                tables += "<td>";
                tables += rs.getString("name");
                tables += "</td>";
                tables += "<td>";
                tables += rs.getString("age");
                tables += "</td>";
                tables += "<td>";
                tables += rs.getString("address");
                tables += "</td>";
                tables += "</tr>";
            }
            tables += "</table>";
            try {
                HttpSession session = request.getSession();
                if (session != null) {
                    String error = (String) session.getAttribute("error");
                    if (!error.equals("") && error != null) {
                        tables += "<p style='color: red'> Error: " + error + "</p>";
                    }
                }
            } catch (Exception ex) {
                
            }
            conn.close();
            // xu ly redirect
            service.showFormRequest(request, response, tables);
        } catch (SQLException ex) {
            out.println(ex.getMessage());
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @param request
     * @param response
     * @throws java.io.IOException
     */
    public void getServletInfo(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Short description</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String error = null;
        if (!name.equals("") && !age.equals("") && !address.equals("")) {
            session.setAttribute("error", null);
            LoginServices service = new LoginServices();
            // Initialize the database 
            try {
                Connection conn = service.initializeDatabase();
                PreparedStatement dbStatement = conn.prepareStatement("insert into fu_info (name, age, address) values(?, ?, ?)");
                // sets the data to st pointer 
                dbStatement.setString(1, name);
                // Same for second parameter 
                dbStatement.setString(2, age);
                // Same for second parameter 
                dbStatement.setString(3, address);
                dbStatement.executeUpdate();
//                // Close all the connections 
                dbStatement.close();
                conn.close();
//                response.sendRedirect("/maven-login-v1/LoginPage");
            } catch (ClassNotFoundException | SQLException ex) {
                out.println(ex.getMessage());
                Logger.getLogger(LoginPage.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            error = "Param not found!";
            session.setAttribute("error", error);
        }
        response.setContentType("text/html;charset=UTF-8");
        this.doGet(request, response);
//        RequestDispatcher rd;
//        if (userInfo.equals("huanvc")) {
//            rd = getServletContext().getRequestDispatcher("/ResultLogin");
//            rd.forward(request, response);
////            response.sendRedirect("ResultLogin?user="+userInfo);
//        }
//        getServletInfo(request, response);
    }

}
