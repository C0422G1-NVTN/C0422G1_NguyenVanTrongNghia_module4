<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17/08/22
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Họ tên (ghi chữ IN HOA)</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</th>
        <th>Thông tin đi lại</th>
        <th>Số hiệu phương tiện</th>
        <th>Số ghế</th>
        <th>Ngày khởi hành</th>
        <th>Ngày kết thúc</th>
        <th>Trong vòng 14 ngày qua,Anh/Chị có đến tỉnh thành phố nào?</th>
    </tr>
    <c:forEach var="medical" items="${medicalList}">
        <tr>
            <td>${medical.name}</td>
            <td>${medical.birthday}</td>
            <td>${medical.gender}</td>
            <td>${medical.nation}</td>
            <td>${medical.idCard}</td>
            <td>${medical.vehicle}</td>
            <td>${medical.idVehicle}</td>
            <td>${medical.idSeat}</td>
            <td>${medical.startDay}</td>
            <td>${medical.endDay}</td>
            <td>${medical.journey}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
