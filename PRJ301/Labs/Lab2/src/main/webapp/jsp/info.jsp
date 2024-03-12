<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="io.fptqnk17.login.dao.EmployeeDAO"%>
<%@page import="io.fptqnk17.login.model.Employee"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Info Page</title>
    </head>
    <body>
        <h1>Danh sách thông tin</h1>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Tuổi</th>
                <th>Địa chỉ</th>
                <th>Hành động</th>
            </tr>
            <%
                List<Employee> employees = EmployeeDAO.getInstance().getAll();

                for (Employee employee : employees) {
            %>
            <tr>
                <td><%= employee.getID()%></td>
                <td><%= employee.getName()%></td>
                <td><%= employee.getAge()%></td>
                <td><%= employee.getAddress()%></td>
                <td>
                    <form action="info" method="post">
                        <input type="hidden" name="id" value="<%= employee.getID()%>">
                        <input type="submit" value="Xóa">
                    </form>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <br/>
        <a href="/login">Quay về</a>
    </body>
</html>
