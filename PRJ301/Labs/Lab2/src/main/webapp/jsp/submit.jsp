<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="submit" method="POST">
            <h1>Nhập thông tin</h1>
            <label for="name">Tên</label>
            <input name="name" placeholder="Tên" required>
            <br>
            <label for="age">Tuổi</label>
            <input name="age" placeholder="Tuổi" required>
            <br>
            <label for="address">Địa chỉ</label>
            <input name="address" placeholder="Địa chỉ" required>
            <br>
            <button type="submit">Nhập thông tin</button>
        </form>
    </body>
</html>
