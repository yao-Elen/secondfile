package com.iflytek.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;
import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;

@WebFilter(filterName="MyFilter",servletNames = {"login","logout"},urlPatterns={"/count.jsp"},
initParams={@WebInitParam(name="count",value="0"),@WebInitParam(name="encoding",value="Utf-8")})
public class MyFilter implements Filter {
//生命周期：生成并初始化Filter时调用，在FilterChain.doFiter()之前调用
     private int count;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        String param=filterConfig.getInitParameter("count");
        count = Integer.valueOf(param);

      //  System.out.println("Myfilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
      count++;
      HttpServletRequest request=(HttpServletRequest) servletRequest;
      ServletContext context=request.getServletContext();
      context.setAttribute("count",count);
      filterChain.doFilter(servletRequest,servletResponse);//Filter的链对象只有一个方法，doFilter()方法，放行，把这个请求放行给下一个服务器或这个过滤器
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
