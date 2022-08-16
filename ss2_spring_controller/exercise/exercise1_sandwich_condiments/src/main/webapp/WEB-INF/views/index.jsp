<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 16/08/22
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form action="/choose-condiments" method="post">
    <c:forEach var="condiment" items="${listSpice}">
      <input type="checkbox" name="condiment" value="${condiment}">${condiment}
    </c:forEach>
    <hr>
    <button>Save</button>
  </form>
  </body>
</html>
