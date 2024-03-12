package controller;

import dao.EmployeeDAO;
import java.io.*;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

/**
 *
 * @author Quoc Chuong
 */
public class Search extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        try {
            int ID = Integer.parseInt(request.getParameter("id"));

            Optional<Employee> emp = EmployeeDAO.getInstance().getId(ID);
            
            if (!emp.isPresent()) {
                response.sendRedirect("/chuong");
            }
            
            emp.ifPresent(e -> {
                request.setAttribute("id", ID);
                request.setAttribute("name", e.getName());
                request.setAttribute("age", e.getAge());
                request.setAttribute("address", e.getAddress());

                try {
                    request.getRequestDispatcher("/jsp/search.jsp").forward(request, response);
                } catch (IOException | ServletException ex) {
                }
            });
        } catch (NumberFormatException ex) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        try {
            int ID = Integer.parseInt(request.getParameter("id"));

            EmployeeDAO.getInstance().delete(ID);
        } catch (NumberFormatException ex) {
        }

        response.sendRedirect("/chuong");
    }

    @Override
    public String getServletInfo() {
        return "Search Page";
    }
}
