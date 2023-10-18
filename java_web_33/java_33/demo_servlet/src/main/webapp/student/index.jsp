<%--
  Created by IntelliJ IDEA.
  User: Nguyen Thuy Duong
  Date: 10/14/2023
  Time: 11:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Danh sách sinh viên</title>
</head>
<body>
<div class="container">
    <h2>Danh sách sinh viên</h2>
    <div class="row">
        <div class="col-5">
            <form action="SearchController" method="get">
                <div class="form-group">
                    <label for="name">Nhập họ và tên:</label>
                    <input type="text" class="form-control" id="name" name="name"
                           value="${name}">
                </div>
                <button type="submit" class="btn btn-primary">Tìm kiếm</button>
            </form>
            <h2>Thêm mới sinh viên</h2>
            <form action="AddController" method="post">
                <div class="form-group">
                    <label for="name">Họ và tên:</label>
                    <input type="text" class="form-control" name="name" value="">
                </div>
                <div class="form-group">
                    <label for="address">Địa chỉ:</label>
                    <input type="text" class="form-control" id="address" name="address" value="">
                </div>
                <div class="form-group">
                    <label for="age">Tuổi:</label>
                    <input type="text" class="form-control" id="age" name="age" value="">
                </div>
                <button type="submit" class="btn btn-success">Thêm mới</button>
            </form>
        </div>
        <div class="col-7">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Họ và tên</th>
                    <th>Địa chỉ</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="student" items="${listStudent}">
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.name}</td>
                        <td>${student.address}</td>
                        <td>
                            <a href="./EditController?id=${student.id}">Edit</a> |
                            <a href="./DeleteController?id=${student.id}"
                               onclick="return confirm('Bạn có chắc chắc muốn xóa student này chứ?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
