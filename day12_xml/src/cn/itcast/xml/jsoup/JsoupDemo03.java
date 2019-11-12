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
 * @created 2019-11-11 23:56
 * @function "Document/Element对象功能"
 */
public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {
        // 1. 获取student.xml的path
                String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        // 2. 获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3 获取元素对象
        //3.1 获取所有student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);
        System.out.println("--------------");
        // 3.2 获取属性名为id的元素对象们
        Element elements1 = document.getElementById("itcast");
        System.out.println(elements1);
        System.out.println("--------------");

    }
}
