package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String name1=request.getParameter("name1");
        PrintWriter out=response.getWriter();
        String []fav = request.getParameterValues("fav");
        String id=request.getParameter("id");
        out.println("<html><body>");
        out.println("用户名:"+name);
        out.println("密码:"+password);
        out.println("姓名:"+name1);
        for (int i=0;i<fav.length;i++){
            out.println(fav[i]);
        }
        out.println("个人信息:"+id);
        out.println("</body></html>");
        out.close();
    }

}
