<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/3/29
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies=request.getCookies();
    String username="";
    String password="";
    if(cookies!=null){
        for(int i=0;i<cookies.length;i++){
            if(cookies[i].getName().equals("user")){  //查找username这个cookie
                username=cookies[i].getValue();//获取用户名
            }
            if(cookies[i].getName().equals("password")){ //查找passwprd这个cookies
                password=cookies[i].getValue();//获取密码
            }
        }
    }
    if ("".equals(username) || "".equals(password)) {  //如果coookies中用户名和密码找不到
%>
<form  action="login" method="post">
<div class="dowebok">

    <div class="logo"></div>

    <div class="form-item">

        <input id="username" type="text" name="username" placeholder="邮箱">

    </div>

    <div class="form-item">

        <input id="password" type="password" name="password" placeholder="登录密码">

    </div>

    <div class="form-item"><input type="submit" value="登录"></div>

    <div class="reg-bar">

        <a class="reg" href="javascript:">立即注册</a>

        <a class="forget" href="javascript:">忘记密码</a>

    </div>

</div>
</form>
<%
    }else{
%>
<script type="text/javascript">window.location.href="success.jsp"</script>
<%
    }
%>


</body>
</html>
