<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/4/18
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
对不起，您没有权限访问，您的IP地址是：<%=request.getAttribute("reqIP") %>不在服务范围内！<hr>
合法地址范围是：<%=request.getAttribute("strstartIp") %>-<%=request.getAttribute("strendIp") %><br>

</body>
</html>
