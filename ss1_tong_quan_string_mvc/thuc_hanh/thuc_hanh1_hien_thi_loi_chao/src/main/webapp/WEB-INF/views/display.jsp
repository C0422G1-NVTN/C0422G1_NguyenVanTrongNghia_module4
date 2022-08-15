<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 15/08/22
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/displayHello" method="post">
    <h1>Nhập tên</h1>
    <input type="text" name="keyChar">
    <button type="submit">Enter</button>
</form>
<h1> ${result}</h1>
</body>
</html>
