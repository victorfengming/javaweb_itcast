package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project javaweb_itcast
 * @package cn.itcast.web.servlet
 * @created 2019-11-13 8:47
 * @function ""
 */
public class ServletDemo01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //提供服务的方法

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("helloServlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
