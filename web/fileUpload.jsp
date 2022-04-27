<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/4/25
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<%--文件的上传格式enctype="multipart/form-data" 说明表单的数据是由多种文件格式组成--%>
<form action="<%=request.getContextPath()%>/fileUpload" method="post" enctype="multipart/form-data" >
  用户名：<input type="text" name="username"/><br/>
    头像:<input type="file" name="imge"><br/>
  <input type="submit" value="提交"/>
</form>
</body>
</html>
