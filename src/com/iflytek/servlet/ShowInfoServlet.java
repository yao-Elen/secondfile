package com.iflytek.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showInfo")
public class ShowInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-type", "text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("name");
        printWriter.write("姓名：" + name);
        printWriter.write("<br>");
        String sex = request.getParameter("sex");
        printWriter.write("性别：" + sex);
        printWriter.write("<br>");
        // int age=toInt(request.getParameter("age");
        String ageStr = request.getParameter("age");
        int age = 0;
        if (ageStr == null || ageStr.equals("")) {
            age = 0;
        } else {
            age = Integer.parseInt(ageStr);
        }
        printWriter.write("年龄：" + age);
        printWriter.write("<br>");
        String nation = request.getParameter("nation");
        printWriter.write("民族：" + nation);
        printWriter.write("<br>");
        String major = request.getParameter("major");
        printWriter.write("专业：" + major);
        printWriter.write("<br>");
        String[] hobby = request.getParameterValues("hobby");
        printWriter.write("兴趣爱好：");
        for (String hobbys : hobby) {
            printWriter.write(hobbys);
            printWriter.write(";");
        }

    }

}
