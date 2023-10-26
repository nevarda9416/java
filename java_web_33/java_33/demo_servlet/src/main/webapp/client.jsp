<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/24/2023
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Thời trang</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Thời trang</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Trang chủ</a></li>
            <c:forEach var="category" items="${categories}">
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">${category.name}
                    <span class="caret"></span>
                </a>
                    <ul class="dropdown-menu">
<%--                        <c:forEach var="subCategory" items="${category.subCategoryList}">--%>
<%--                            <c:if test="${category.id == subCategory.category_id}">--%>
<%--                                <li><a href="#">${subCategory.name}</a></li>--%>
<%--                            </c:if>--%>
<%--                        </c:forEach>--%>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </div>
</nav>
</body>
</html>