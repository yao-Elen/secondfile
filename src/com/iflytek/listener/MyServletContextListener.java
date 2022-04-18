package com.iflytek.listener;

import com.iflytek.po.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {
    //全局配置的加载
    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent sce) {
        System.out.println("ServletContextListener.contextInitialized");
        ServletContext sc=sce.getServletContext();//获取ServletContext对象
        String Author=sc.getInitParameter("Author");//获取配置文件中的参数
        String lastModifiedTime=sc.getInitParameter("lastModifiedTime");
        Config config=new Config();
        config.setAuthor(Author);
        config.setLastModifiedTime(lastModifiedTime);
        sc.setAttribute("config",config);
        sc.setAttribute("onlineNum",0);//在线人数
        sc.setAttribute("totalVisit",0);//总访问量

    }
    @Override
    public void contextDestroyed(javax.servlet.ServletContextEvent arg0) {
        System.out.println("ServletContextListener.contextDestroyed");
    }



}
