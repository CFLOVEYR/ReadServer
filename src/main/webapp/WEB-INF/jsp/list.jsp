<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jalen
  Date: 17/1/13
  Time: 下午8:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书馆</title>
</head>
<body>
<h1>图书管理系统</h1>
<c:forEach items="${requestScope.list }" var="u">
    编号： ${u.bookId}    图书名字： ${u.name }     数目：${u.number }<br/>
</c:forEach>
</body>
</html>
