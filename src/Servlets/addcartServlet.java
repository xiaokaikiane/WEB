package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "addcartServlet")
public class addcartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        List<String> list = (List<String>) session.getAttribute("cart");
        if(list==null){
            list=new ArrayList<>();
        }

        String id = request.getParameter("id");
        list.add(id);
        session.setAttribute("cart", list);

        System.out.println(list.toString());
        response.getWriter().println("已加入购物车<br/>"
                + "<a href='"+request.getContextPath()+"/home'>继续购物</a><br/>"
                + "<a href='"+request.getContextPath()+"/show/cart'>查看购物车</a><br/>");
    }
}
