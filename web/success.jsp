<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/3/30
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
我是登录后的页面
name:${loginUser.username}
<br>
id:${loginUser.password}
<a href="logoutServlet">退出</a>
</body>
</html>
