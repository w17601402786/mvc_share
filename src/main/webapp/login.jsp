<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(function() {
            $('form').submit(function(event) {
                event.preventDefault();
                var name = $('#name').val();
                var password = $('#password').val();
                $.ajax({
                    url: '${pageContext.request.contextPath}/login',
                    type: 'POST',
                    data: {name: name, password: password},
                    success: function(data) {
                        $('#msg').text(data.msg);
                        if (data.status == 200) {
                            window.location.href = '${pageContext.request.contextPath}/login.jsp';
                        }
                    },
                    error: function() {
                        $('#msg').text('An error occurred while processing your request.');
                    }
                });
            });
        });
    </script>
</head>
<body>
<h1>Login Page</h1>
<form>
    <label for="name">Username:</label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Login">
</form>
<br>
<p id="msg"></p>
</body>
</html>