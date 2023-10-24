<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
  <title>Quản lý danh mục</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Thêm danh mục con</h2>
  <form action="Category/AddController" method="post">
    <input type="hidden" name="id" value="${category.id}">
    <div class="form-group">
      <label for="name">Tên:</label>
      <input type="text" class="form-control" id="name" name="name" value="${category.name}">
    </div>
    <div class="form-group">
      <label for="category">Danh mục cha:</label>
      <select name="category" id="category" class="selectpicker">
        <c:forEach var="cate" items="${list.cate}">
          <option value="${cate.id}">${cate.name}</option>
        </c:forEach>
      </select>
    </div>
    <button type="submit" class="btn btn-default">Cập nhật</button>
  </form>
</div>
</body>
</html>
