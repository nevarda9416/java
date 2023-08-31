<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/31/2023
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông tin đăng ký</title>
</head>
<body>
    <h1>Thông tin người dùng đã đăng ký</h1>
    <p>Username: <%= request.getAttribute("username") %></p>
    <p>Password: <%= request.getAttribute("password") %></p>
</body>
</html>
