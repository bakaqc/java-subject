<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="model.Employee"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Infomation Page</title>
    </head>
    <body>
        <h1>List Infomation</h1>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Address</th>
                <th>Action</th>
            </tr>
            <%
                List<Employee> employees = EmployeeDAO.getInstance().getAll();

                for (Employee employee : employees) {
            %>
            <tr>
                <td><%= employee.getId()%></td>
                <td><%= employee.getName()%></td>
                <td><%= employee.getAge()%></td>
                <td><%= employee.getAddress()%></td>
                <td>
                    <form action="info" method="post">
                        <input type="hidden" name="id" value="<%= employee.getId()%>">
                        <input type="submit" value="Xóa">
                    </form>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <br/>
        <a href="/chuong">Return</a>
    </body>
</html>
