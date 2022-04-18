package com.iflytek.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener {
    public MySessionListener() {
    }

    public void sessionCreated(javax.servlet.http.HttpSessionEvent sessionEvent) {
        System.out.println("sessionCreated");
        ServletContext sc = sessionEvent.getSession().getServletContext();
        Integer onlineNum = (Integer) sc.getAttribute("onlineNum");//获取原来在线人数
        sc.setAttribute("onlineNum", ++onlineNum);//在线人数加1
     /*   if(onlinNum==null){
            onlinNum=0;
        }else {
            onlinNum++;
        }*/
    }

    public void sessionDestroyed(javax.servlet.http.HttpSessionEvent sessionEvent) {
        System.out.println("sessionDestroyed");
        ServletContext sc = sessionEvent.getSession().getServletContext();
        Integer onlineNum = (Integer) sc.getAttribute("onlineNum");//获取原来在线人数
     /*   if(onlinNum==null){
            onlinNum=0;
        }else {
            onlinNum--;
        }*/
        sc.setAttribute("onlineNum", --onlineNum);//在线人数减1
    }
}
