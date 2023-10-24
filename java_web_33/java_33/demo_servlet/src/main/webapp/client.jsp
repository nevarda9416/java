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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

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
            <c:forEach var="cate" items="${categories}">
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">${category.name}
                    <span class="caret"></span>
                </a>
                    <ul class="dropdown-menu">
                        <c:forEach var="subCate" items="${cate.subCategoryList}">
                            <c:if test="${cate.id == subCate.category_id}">
                                <li><a href="#">${subCate.name}</a></li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </div>
</nav>
</body>
</html>
