package com.iflytek.servlet;

import com.iflytek.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //设置请求是的字符编码
        request.setCharacterEncoding("utf-8");
        //设置响应是的字符编码
        response.setCharacterEncoding("utf-8");
        /* PrintWriter pt=request.*/
        String username = request.getParameter("username");//获取用户名
        String password = request.getParameter("password");//获取密码
        //验证登录的方式、、通过用户名和密码
        if (username.equals("admin") && password.equals("123")) {
            User user = new User();
            user.setUsername("admin");
            user.setPassword("123");
            request.getSession().setAttribute("loginUser", user);
            //response.getWriter().write("登录成功");
            //将获取到的用户名带到页面
            HttpSession session = request.getSession();
            request.getAttribute("username");
            // 验证通过，跳转到首页
            //getRequestDispatcher转发
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } else {
            //如果登录失败，跳转到登录页面
            //sendRedirect重定向
            request.setAttribute("msg", "您输入的账号或密码有误");
            request.getRequestDispatcher("sussess.jsp").forward(request,response);
            //response.sendRedirect("login.jsp");
        }
    }
}
