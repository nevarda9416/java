<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/31/2023
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng ký thành viên</title>
</head>
<body>
    <div style="width:500px;margin:30px auto">
        <h2>Đăng ký thành viên</h2>
        <form action="<%= request.getContextPath()%>/register" method="post">
            <div>
                <label>Tên đăng nhập:
                    <input type="text" name="username" value=""/>
                </label>
            </div>
            <br/>
            <div>
                <label>Mật khẩu:
                    <input type="password" name="password" value=""/>
                </label>
            </div>
            <br/>
            <div>
                <input type="submit" name="submit" value="Đăng ký"/>
                <input type="reset" name="reset" value="Nhập lại"/>
            </div>
        </form>
    </div>
</body>
</html>
