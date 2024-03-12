<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="Submit" method="POST">
            <h1>Enter Infomation</h1>
            <label for="name">Name</label>
            <input name="name" placeholder="Name" required>
            <br>
            <label for="age">Age</label>
            <input name="age" placeholder="Age" required>
            <br>
            <label for="address">Address</label>
            <input name="address" placeholder="Address" required>
            <br>
            <button type="submit">Enter Infomation</button>
        </form>
    </body>
</html>
