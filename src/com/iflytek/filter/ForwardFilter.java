package com.iflytek.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(filterName = "forwardFilter",urlPatterns = "/first.jsp",dispatcherTypes = DispatcherType.FORWARD)
public class ForwardFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().print("i am forwardFilter");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
