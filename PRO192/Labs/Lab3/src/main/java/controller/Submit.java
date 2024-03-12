package controller;

import dao.EmployeeDAO;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

public class Submit extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.getRequestDispatcher("/jsp/submit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");
        int age = 0;
        String address = request.getParameter("address");

        try {
            age = Integer.parseInt(request.getParameter("age"));
        } catch (NumberFormatException ex) {
            age = 0;
        }

        EmployeeDAO.getInstance().insert(new Employee(name, age, address));

        response.sendRedirect("/chuong");
    }

    @Override
    public String getServletInfo() {
        return "Submit Page";
    }
}
