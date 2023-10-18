<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Cập nhật thông tin</h2>
    <form action="EditController" method="post">
        <input type="hidden" name="id" value="${student.id}">
        <div class="form-group">
            <label for="name">Họ và tên:</label>
            <input type="text" class="form-control" id="name" name="name" value="${student.name}">
        </div>
        <div class="form-group">
            <label for="address">Địa chỉ:</label>
            <input type="text" class="form-control" id="address" name="address" value="${student.address}">
        </div>
        <div class="form-group">
            <label for="age">Tuổi:</label>
            <input type="text" class="form-control" id="age" name="age" value="${student.age}">
        </div>
        <button type="submit" class="btn btn-default">Cập nhật</button>
    </form>
</div>

</body>
</html>
