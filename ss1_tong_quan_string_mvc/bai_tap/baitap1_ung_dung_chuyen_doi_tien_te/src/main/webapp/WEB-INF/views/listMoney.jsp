<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/08/22
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>currency conversion</h1>
<form action="/convert" method="post">
    <h2>Nhập số tiền $</h2>
    <input type="number" name="usd">
    <button type="submit">Enter</button>
</form>
<h2>Số tiền sau khi chuyển đổi sang vnd</h2>
<p>${result}vnd</p>
</body>
</html>
