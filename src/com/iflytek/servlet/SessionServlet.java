package com.iflytek.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sessionServlet")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession htttpSession=request.getSession();
        htttpSession.setAttribute("username","yao");
        htttpSession.setAttribute("password","123");
        String username= (String) htttpSession.getAttribute("username");
        String password= (String) htttpSession.getAttribute("password");
        htttpSession.isNew();//描述session是否是刚创建的
        htttpSession.invalidate();//session消亡
    }
}
