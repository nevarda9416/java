<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/26/2023
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Quản lý sản phẩm</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Thêm sản phẩm</h2>
    <form class="form-horizontal" action="AddController" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label class="control-label col-sm-2" for="name">Tên:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="price">Giá:</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="price" name="price">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="price">Hình ảnh:</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" id="image" name="image">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="category_id">Danh mục:</label>
            <div class="col-sm-10">
                <select class="form-control" id="category_id" name="category_id">
                    <c:forEach var="category" items="${subcategories}">
                        <option value="${category.id}">${category.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Cập nhật</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
