<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
    <h1>学生信息</h1>
    <%-- 获取POST请求中的学生信息 --%>
    <% String studentId = request.getParameter("studentId"); %>
    <% String name = request.getParameter("name"); %>
    <% String gender = request.getParameter("gender"); %>
    <% String birthDate = request.getParameter("birthDate"); %>
    <% String score = request.getParameter("score"); %>
    <%-- 显示学生信息 --%>
    <p>学号： <%= studentId %> </p>
    <p>姓名： <%= name %> </p>
    <p>性别： <%= gender %> </p>
    <p>出生日期： <%= birthDate %> </p>
    <p>成绩： <%= score %> </p>
</body>
</html>