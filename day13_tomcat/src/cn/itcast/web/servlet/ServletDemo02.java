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
public class ServletDemo02 implements Servlet {
    /**
     * servlet被创建时执行,只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init-----执行了一次");
    }

    /**
     * 获取servlet对象
     * 读取配置信息
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("ServletConfig执行了");
        return null;
    }

    /**
     * 提供服务的方法  每一次Servlet被访问时,执行.执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service执行了");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo-执行了");
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时,执行,执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy执行了");
    }
}
