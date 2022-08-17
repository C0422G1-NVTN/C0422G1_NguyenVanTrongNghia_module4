<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17/08/22
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<a class="btn btn-success" href="/list">Danh sách</a>

<nav class="navbar navbar-light bg-light text-center">
    <div class="container-fluid">
        <span class="navbar-brand mb-0 h1 ">Tờ Khai Y Tế</span>
    </div>
</nav>

<form:form action="/save" method="post" modelAttribute="medical">
    <div class="container-fluid">
        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Họ tên</span>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default"
                        path="name"/>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Năm sinh:</span>
            <form:select path="birthday" items="${yearList}"></form:select>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Giới tính</span>
            <form:select path="gender">
                <form:option value="true">Nam</form:option>
                <form:option value="false">Nữ</form:option>
            </form:select>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Quốc tịch</span>
            <form:select path="nation" items="${nationList}"></form:select>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Số hộ chiếu</span>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default"
                        path="idCard"/>
        </div>

        <div class="input-group mb-3 align-items-center">
            <span class="input-group-text" id="inputGroup-sizing-default">Thông tin đi lại</span>
            <form:radiobuttons cssClass="form-check-input ms-2 " path="vehicle" items="${vehicleList}"/>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Số hiệu phương tiện</span>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default"
                        path="idVehicle"/>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Số Ghế</span>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default"
                        path="idSeat"/>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Ngày khởi hành</span>
            <form:select path="startDay" cssClass="ms-1" items="${dayList}"></form:select>
            <form:select path="startMonth" cssClass="ms-1" items="${monthList}"></form:select>
            <form:select path="startYear" cssClass="ms-1" items="${yearList}"></form:select>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="inputGroup-sizing-default">Ngày Kết thúc</span>
            <form:select path="endDay" cssClass="ms-1" items="${dayList}"></form:select>
            <form:select path="endMonth" cssClass="ms-1" items="${monthList}"></form:select>
            <form:select path="endYear" cssClass="ms-1" items="${yearList}"></form:select>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text"
                  id="inputGroup-sizing-default">Trong vòng 14 ngày anh chị đi những đâu:</span>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default"
                        path="journey"/>
        </div>

        <button class="btn btn-primary" type="submit">Save</button>
    </div>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
