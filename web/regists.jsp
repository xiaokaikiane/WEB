<%--
  Created by IntelliJ IDEA.
  User: 11316
  Date: 2019/10/31
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
欢迎光临<br>
<form method="post" action="/Servlets/Servlet1">
    输入用户名:<input type="text" name="name"><br>
    输入密码:<input type="password" name="password"><br>
    姓名:<input type="text" name="name1"><br>
    选择爱好(多选):
    <input name="fav" type="checkbox" value="唱歌">唱歌
    <input name="fav" type="checkbox" value="跳舞">跳舞
    <input name="fav" type="checkbox" value="打球">打球
    <input name="fav" type="checkbox" value="打游戏">打游戏
    <input name="fav" type="checkbox" value="其他">其他
    <br>
    <textarea name="id" rows="4" cols="10"></textarea><br>
    <input type="submit" value="确认">
</form>
</body>
</html>
