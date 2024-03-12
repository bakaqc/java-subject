<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Login Page</h1>
        <a href="/">Nhập thông tin</a>
        <br/>
        <a href="/mavenproject1/LoginResult">Tất cả thông tin</a>
        <br/>
        <form action="search" method="get">
            <input name="id" placeholder="Nhập ID" required>
            <input type="submit" value="Tìm">
        </form>
    </body>
</html>

