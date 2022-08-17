<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17/08/22
  Time: 2:00 PM
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
        <th>Languages</th>
        <th>Page Size</th>
        <th>Spams Filter</th>
        <th>Signature</th>
    </tr>
    <c:forEach var="email" items="${emailList}">
        <tr>
            <td>${email.languages}</td>
            <td>${email.pageSize}</td>
            <td>${email.spamsFilter}</td>
            <td>${email.signature}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
