package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project javaweb_itcast
 * @package cn.itcast.xml.jsoup
 * @created 2019-11-12 10:31
 * @function ""
 */
public class JsoupDemo04 {
    public static void main(String[] args) throws IOException {
        // 1. 获取student.xml的path
                String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        // 2. 获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("name");
        Element element1 = document.getElementsByTag("name").get(1);
        System.out.println(elements.size());
        System.out.println(element1);
    }
}
