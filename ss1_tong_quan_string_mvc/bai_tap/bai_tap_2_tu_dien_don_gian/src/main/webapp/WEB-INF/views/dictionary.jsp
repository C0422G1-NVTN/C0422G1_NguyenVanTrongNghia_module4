<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 15/08/22
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Dictionary English To Vietnamese</h1>
<form action="/search" method="post">
<h2>Nhập từ tiếng Anh</h2>
    <input type="text" name="keySearch">
    <button type="submit">Enter</button>
</form>
<h2>Kết quả</h2>
<h2>${result}</h2>
</body>
</html>
