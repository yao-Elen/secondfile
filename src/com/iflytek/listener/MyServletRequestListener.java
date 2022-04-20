package com.iflytek.listener;

import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {
    /**
     * 在请求初始化之前调用
     * @param sre
     */
    public void requestInitialized(javax.servlet.ServletRequestEvent sre) {
        System.out.println("requestInitialized");
        // System.out.println("RequestListener requestInitialized");
        Integer  totalVisit=(Integer)sre.getServletContext().getAttribute("totalVisit");
        sre.getServletContext().setAttribute("totalVisit",++totalVisit);
        System.out.println("历史总访问次数"+totalVisit);

    }
    public void requestDestroyed(javax.servlet.ServletRequestEvent sre) {
        System.out.println("requestDestroyed");
    }


}
