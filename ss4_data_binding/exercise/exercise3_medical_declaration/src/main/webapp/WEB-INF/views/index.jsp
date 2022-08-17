<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17/08/22
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form action="/save" method="get" modelAttribute="medical">
    <div>
        <form:label path="name">Họ và tên:</form:label>
        <form:input path="name"></form:input>
    </div>
    <div>
        <form:label path="birthday">Năm sinh:</form:label>
        <form:select path="birthday" items="${yearList}"></form:select>
    </div>
    <div>
        <form:label path="nation">Quốc tịch:</form:label>
        <form:select path="nation" items="${yearList}"></form:select>
    </div>
    <div>
        <form:label path="idCard">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác:</form:label>
        <form:input path="idCard"></form:input>
    </div>
    <div>
        <form:label path="vehicle">Thông tin đi lại</form:label>
        <form:checkbox path="vehicle"></form:checkbox>
    </div>
    <div>
        <form:label path="idVehicle">Số hiệu phương tiện:</form:label>
        <form:input path="idVehicle"></form:input>
    </div>
    <div>
        <form:label path="idSeat">Số ghế:</form:label>
        <form:input path="idSeat"></form:input>
    </div>
    <div>
        <form:label path="s">Ngày khởi hành:</form:label>
        <form:select path="startDay" items="${dayList}"></form:select>
        <form:select path="startMonth" items="${monthList}"></form:select>
        <form:select path="startYear" items="${yearList}"></form:select>
    </div>
    <button type="submit">Save</button>
</form:form>
</body>
</html>
