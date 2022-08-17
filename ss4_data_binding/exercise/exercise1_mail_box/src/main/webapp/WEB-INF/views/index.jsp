<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17/08/22
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form action="/save" method="get" modelAttribute="email">
    <div>
        <form:label path="languages">Languages:</form:label>
        <form:select path="languages" items="${languageList}"></form:select>
    </div>
    <div>
        <form:label path="pageSize">Page Size:</form:label>
        <form:select path="pageSize" items="${sizeList}"></form:select>
    </div>
    <div>
        <form:label path="spamsFilter">Spams Filter</form:label>
        <form:checkbox path="spamsFilter"></form:checkbox>
    </div>
    <div>
        <form:label path="signature">Signature</form:label>
        <form:textarea path="signature"></form:textarea>
    </div>
    <button type="submit">Save</button>
</form:form>
</body>
</html>
