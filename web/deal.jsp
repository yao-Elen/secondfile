<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/3/30
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("passwprd");
    Cookie cookie=new Cookie("username",username);
    Cookie cookie1=new Cookie("password",password);
    cookie.setMaxAge(30);
    cookie1.setMaxAge(30);
    response.addCookie(cookie);
    response.addCookie(cookie1);

%>
<script type="text/javascript" >window.location.href="login.jsp"</script>
</body>
</html>
