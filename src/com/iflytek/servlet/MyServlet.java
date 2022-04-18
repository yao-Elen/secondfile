package com.iflytek.servlet;

import com.iflytek.po.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="/MyServlet",urlPatterns={"/MyServlet"})
public class MyServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("hello MyServlet");
        ServletContext sc=req.getServletContext();
        Config config=(Config)sc.getAttribute("config");//获取配置信息
        resp.getWriter().println(config.getAuthor());
    }
}
