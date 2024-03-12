package se.maven.login.page;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServices</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServices at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    public void showFormRequest(HttpServletRequest request,
            HttpServletResponse response, String tables) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Content-Type", "text/html; charset=UTF-8");
        HttpSession session = request.getSession();
        session.setAttribute("error", null);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServices</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServices at </h1>");
            out.println(tables);
            out.println("<br/>");
            out.println("<form method='post' action='/mavenproject1'>");
            out.println("<lable style='width: 80px;display: inline-block;'>Name: </lable><input name='name' type='text' />");
            out.println("<br/>");
            out.println("<lable style='width: 80px;display: inline-block;'>Age: </lable><input name='age' type='text' />");
            out.println("<br/>");
            out.println("<lable style='width: 80px;display: inline-block;'>Address: </lable><input name='address' type='text' />");
            out.println("<br/>");
            out.println("<input type='submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {

        }
    }

    public void getDataMethodPost(HttpServletRequest request,
            HttpServletResponse response) {

    }

    public void showDataLoginSuccess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("user_info");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResultLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login Success with User Name: " + userName + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
