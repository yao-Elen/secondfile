<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/4/18
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
I am  first.jsp
<:c:set var="name" value="${requestScope.name}" scope="page"/>
</body>
</html>
