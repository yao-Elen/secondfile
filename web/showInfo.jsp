<%--
  Created by IntelliJ IDEA.
  User: 追鱼
  Date: 2022/4/27
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
<form action="showInfo" method="post">
    <strong>基本资料</strong>
    <table cols="2" border="1" width="800xp">

        <tr>
            <td bgcolor="#f0f8ff" aria-setsize="4">姓名</td>
            <td colspan="4"><input type="text" size="18" name="name"></td>
        </tr>

        <tr>
            <td bgcolor="#f0f8ff" aria-setsize="4">性别</td>
            <td colspan="2">
                <input type="radio" size="16" name="sex" value="男">男
                <input type="radio" size="16" name="sex" value="女">女
            </td>
            <td bgcolor="#f0f8ff">年龄</td>
            <td colspan="4">
                <input type="number" name="age"></td>
        </tr>

        <tr>
            <td bgcolor="#f0f8ff" aria-setsize="4">民族</td>
            <td colspan="4">
                <input type="radio" name="nation" value="汉" checked>汉族
                <input type="radio" name="nation" value="回族">回族
                <input type="radio" name="nation" value="维吾尔族">维吾尔族
            </td>
        </tr>

        <tr>
            <td bgcolor="#f0f8ff" aria-setsize="4">专业</td>
            <td colspan="4">
                <select name="major">
                    <option value="软件">软件工程</option>
                    <option value="信息">信息工程</option>
                    <option value="网络">网络工程</option>
                    <option value="土木">土木工程</option>
                </select>
            </td>
        </tr>
    </table>
    <strong>兴趣爱好：</strong>
    <table width="800" cols="2" border="1">

        <tr>
            <td width="10%">兴趣爱好：
            </td>
            <td width="82%">
                <input type="checkbox" name="hobby" value="电影">电影
                <input type="checkbox" name="hobby" value="戏剧">戏剧
                <input type="checkbox" name="hobby" value="音乐">音乐
                <input type="checkbox" name="hobby" value="美术">美术
            </td>
        </tr>

    </table>
    <br>
    <input type="submit" value="注册" name="submit1">
</form>

</body>
</html>
