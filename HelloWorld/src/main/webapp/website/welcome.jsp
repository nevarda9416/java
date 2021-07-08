<%-- 
    Document   : welcome
    Created on : Aug 20, 2020, 10:25:26 PM
    Author     : Admin
--%>

<%@page import="models.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome JSP Page</title>
    </head>
    <body>
        <%
        // request, response, session, out
        User user = (User) request.getAttribute("user");
        %>
        <h1>Hello <%=user.getName()%>!</h1>
        <h1>Hello <%
            out.print(user.getName());
                    %>!</h1>
        <a href="history-register-users">History Register Users</a>
    </body>
</html>
