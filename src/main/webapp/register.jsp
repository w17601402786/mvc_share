<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(function() {
            $('form').submit(function(event) {
                event.preventDefault();
                var name = $('#name').val();
                var password = $('#password').val();
                $.ajax({
                    url: '${pageContext.request.contextPath}/register',
                    type: 'POST',
                    data: {name: name, password: password},
                    success: function(data) {
                        if (data.success) {
                            window.location.href = '${pageContext.request.contextPath}/login';
                        } else {
                            $('#msg').text(data.msg);
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
<h1>Register Page</h1>
<form>
    <label for="name">Username:</label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Register">
</form>
<br>
<p id="msg"></p>
</body>
</html>