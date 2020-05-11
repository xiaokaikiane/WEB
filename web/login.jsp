<%--
  Created by IntelliJ IDEA.
  User: 11316
  Date: 2019/10/31
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%
        Cookie[] cookies=request.getCookies();
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user1")) {
                    response.sendRedirect("Hello.jsp");
                    break;
                }else{
                    response.sendRedirect("regist.jsp");
                }
            }
        }
    %>
</head>
<body>
<form method="post" action="Servlets/Servlet2">
    用户名:<input type="text" name="user"><br>
    密码:<input type="password" name="password"><br>
    两周免登陆:<input type="radio" name="login" value="是">是
    <input type="radio" name="login" value="否">否<br>
    登录:<input  type="submit" name="select" value="登录">
</form>
</body>
</html>
