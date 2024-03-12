package controller;

import dao.EmployeeDAO;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Infomation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.getRequestDispatcher("/jsp/info.jsp").forward(request, response);
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
        request.getRequestDispatcher("/jsp/info.jsp").forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Infomation Page";
    }


}
