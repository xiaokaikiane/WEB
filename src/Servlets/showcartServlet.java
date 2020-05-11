package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "showcartServlet")
public class showcartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        List<String> list = (List<String>)request.getSession().getAttribute("cart");
        if(list!=null){
            out.print("你的购物清单：<br/>");
            for (String string : list) {
                out.println(DBUtils.findById(string)+"<br/>");
            }
            out.println("<br/><a href='"+request.getContextPath()+"/home'>继续购物</a><br/>");
        }else{
            out.println("你还没有将商品添加到购物车<br/>"
                    + "<a href='"+request.getContextPath()+"/home'>返回商品列表</a><br/>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
