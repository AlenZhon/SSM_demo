<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/11
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询到所有账户</h2>
<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money} <br>
</c:forEach>
</body>
</html>
