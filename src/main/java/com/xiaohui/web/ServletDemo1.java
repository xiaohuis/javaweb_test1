package com.xiaohui.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import java.io.IOException;


public class ServletDemo1 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("fdfff");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
