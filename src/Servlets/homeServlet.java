package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "homeServlet")
public class homeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<h2>书单</h2><hr/><br/>");
        out.print("数学<a href='"+request.getContextPath()+"/addCart?id=1'>加入购物车</a><br/>");
        out.print("语文<a href='"+request.getContextPath()+"/addCart?id=2'>加入购物车</a><br/>");
        out.print("英语<a href='"+request.getContextPath()+"/addCart?id=3'>加入购物车</a><br/>");
        out.print("化学<a href='"+request.getContextPath()+"/addCart?id=4'>加入购物车</a><br/>");
        out.print("<a href='"+request.getContextPath()+"/show/cart'>查看购物车</a><br/>");


    }
}
