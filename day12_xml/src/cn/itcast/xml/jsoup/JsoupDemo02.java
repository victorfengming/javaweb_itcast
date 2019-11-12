package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project javaweb_itcast
 * @package cn.itcast.xml.jsoup
 * @created 2019-11-11 11:56
 * @function "Jsoup对象功能"
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {

        // 2.1 获取student.xml的path
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        // 2.2 解析xml文档,加载文档进内存,获取dom树,-->Document
//            Document document = Jsoup.parse(new File(path),"utf-8");
        // System.out.println(document);
        // 这个是以字符串的形式打印在控制台上面
        // parse(String html),解析
        String str = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone='yes'?>\n" +
                "<students>\n" +
                "    <student number=\"heima_001\">\n" +
                "        <name>tom</name>\n" +
                "        <age>18</age>\n" +
                "        <sex>male</sex>\n" +
                "    </student>\n" +
                "    <student number=\"heima_002\">\n" +
                "        <name>jack</name>\n" +
                "        <age>19</age>\n" +
                "        <sex>female</sex>\n" +
                "    </student>\n" +
                "</students>";
        Document document = Jsoup.parse(str);
        System.out.println(document);
    }
}
