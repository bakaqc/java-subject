<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Employee"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Address</th>
                <th>Action</th>
            </tr>
            <tr>
                <td><%= (int) request.getAttribute("id")%></td>
                <td><%= (String) request.getAttribute("name")%></td>
                <td><%= (int) request.getAttribute("age")%></td>
                <td><%= (String) request.getAttribute("address")%></td>
                <td>
                    <form action="search" method="post">
                        <input type="hidden" name="id" value="<%= request.getParameter("id")%>">
                        <input type="submit" value="Xóa">
                    </form>
                </td>
            </tr>
        </table>
        <br/>
        <a href="/chuong">Return</a>
    </body>
</html>
