<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page!</h1>
        
         <a href="/chuong/Submit">Enter Infomation</a>
        <br/>
        <a href="/chuong/Information">List Infomation</a>
        <br/>
        <form action="search" method="get">
            <input name="id" placeholder="Enter ID" required>
            <input type="submit" value="Search">
        </form>
    </body>
</html>
