<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/4/18
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
已经销毁session
<hr/>
<%
    request.getSession().invalidate();
%>
</body>
</html>
