<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/5/11
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="stu" class="com.iflytek.po.Student" scope="session"/>

<jsp:setProperty name="stu" property="name" value="追鱼"/>
<jsp:setProperty name="stu" property="age" value="18"/>
<jsp:setProperty name="stu" property="sex" value="男"/>

姓名：
<jsp:getProperty name="stu" property="name"/>
年龄：
<jsp:getProperty name="stu" property="age"/>

<jsp:useBean id="stu1" class="com.iflytek.po.Student">
    <jsp:setProperty name="stu1" property="*"/>
</jsp:useBean>
</body>
</html>
