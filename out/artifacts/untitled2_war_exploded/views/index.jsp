<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
    <h1>Login Form</h1>
    <form action="./submit" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name">
        <br><br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password">
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>