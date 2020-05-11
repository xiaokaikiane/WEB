package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=utf-8");
       request.setCharacterEncoding("utf-8");
       if(request.getParameter("login").equals("是")){
           Cookie cookie=new Cookie("user1",request.getParameter("user"));
           cookie.setMaxAge(14*24*60*60);
           cookie.setPath("/");
           response.addCookie(cookie);
       }
       response.sendRedirect("/Hello.jsp");
    }
}