package com.iflytek.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(filterName = "filterip",initParams = {@WebInitParam(name="startIp",value="127.0.0.2"),@WebInitParam(name="endIp",value="127.0.0.5")},urlPatterns = "/*")
public class FiltIp implements Filter {
    private FilterConfig filterConfig;
    private int startIp; // 起始IP地址
    private int endIp; // 结束IP地址

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String strstartIp = filterConfig.getInitParameter("startIp");
        String strendIp = filterConfig.getInitParameter("endIp");
        request.setAttribute("strstartIp", strstartIp);
        request.setAttribute("strendIp", strendIp);
        //将起始IP地址中的"."去掉,再转为整型量，如127.0.0.1变为127001,
        startIp = Integer.parseInt(strstartIp.replace(".", ""));
        endIp = Integer.parseInt(strendIp.replace(".", ""));
        String reqIP = request.getRemoteHost(); // 获取客户端的IP地址
        request.setAttribute("reqIP", reqIP);
        reqIP = reqIP.replace(".", ""); // 将IP地址中的"."去掉，如127.0.0.1变为127001
        int ip = Integer.parseInt(reqIP); // 将字符串转为int型数据
        // 如果用户的IP不在允许范围内则转发到error.jsp页面
        if (ip < startIp || ip > endIp) {
            request.getRequestDispatcher("filtip.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
        filterChain.doFilter(servletRequest, servletResponse); // 调用下一个FILTER或调用资源

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
