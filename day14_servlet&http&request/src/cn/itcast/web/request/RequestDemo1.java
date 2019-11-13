package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author victor
 * @site https:		//victorfengming.github.io/
 * @company XDL
 * @project javaweb_itcast
 * @package ${PACKAGE_NAME}
 * @created 2019-11-13 13:31
 * @function "演示request对象获取请求行数据"
 */
@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//*   1. 获取请求方式:GET
		//        - String getMethod();
        String method = request.getMethod();
        System.out.println(method);
		//    2. 获取虚拟目录:day14
		//        - String getContextPath()
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
		//    3. 获取Servlet路径:/demo1
		//        - Stirng getServletPath
        String servletPath = request.getServletPath();
		//    4. 获取get方式请求参数:name = zhangsan
		//        - String getQueryString()
        String para = request.getQueryString();
        System.out.println(para);
		//    5. 获取请求URI:/day14/demo1
		//        - String getRequestURI()
		//        - StringBuffer getRequestURL()
        String urll = request.getRequestURI();
        System.out.println(urll);
		//    6. 获取协议版本:HTTP/1.1
		//        - String getProtocol()
        String version = request.getProtocol();
        System.out.println(version);
		//    7. 获取客户机的IP地址
		//        - String getRemoteAddr()
        String address = request.getRemoteAddr();
        System.out.println(address);


    }
}
