package se.maven.login.page;

import java.sql.*;
import java.io.*;
import static java.lang.System.out;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.http.*;
import se.maven.login.db.JDBC;
import se.maven.login.service.LoginService;
import se.maven.login.controller.*;
import se.maven.login.model.Employee;

public class LoginPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Content-Type", "text/html; charset=UTF-8");
        request.getRequestDispatcher("/index.jsp").forward(request, response);

//        try {
//            LoginService service = new LoginService();
//            Connection conn = JDBC.getConnection();
//            PreparedStatement stmt = conn.prepareStatement("select * from employee order by id desc limit 10;");
//            ResultSet rs = stmt.executeQuery();
//
////            String tables = "<style type='text/css'>table,th,td{border:1px solid black;}</style><body><h2>Information Of All Employee</h2>";
////            tables += "<tr><th>name</th><th>age</th><th>address</th></tr>";
//            JDBC.closeConnection(conn);
////            service.showFormRequest(request, response, tables);
//
//        } catch (SQLException ex) {
//
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        
        String address = request.getParameter("address");
        String error = null;
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        Manager.getInstance().insert(new Employee(name, age, address));
//        if (!name.equals("") && !age.equals("") && !address.equals("")) {
//            session.setAttribute("error", null);
////            LoginService service = new LoginService();
//
//            
//
//        } else {
//            error = "Param not found!";
//            session.setAttribute("error", error);
//        }
        response.setContentType("text/html;charset=UTF-8");
    }

}
