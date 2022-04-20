package com.iflytek.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "charactorFilter", urlPatterns = "/*", initParams = {@WebInitParam(name = "encoding", value = "utf-8")})
public class CharactorFilter implements Filter {
    private String encoding = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        encoding = filterConfig.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (encoding != null) {
            servletRequest.setCharacterEncoding(encoding);
            servletResponse.setCharacterEncoding(encoding);
            servletResponse.setContentType("text/html,encoding=" + encoding);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        encoding = null;
    }
}
