package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project javaweb_itcast
 * @package cn.itcast.xml.jsoup
 * @created 2019-11-12 10:49
 * @function "选择器查询"
 */
public class JsoupDemo05 {
    public static void main(String[] args) throws IOException {
        // 1. 获取student.xml的path
                String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        // 2. 获取Document对象
        // 其实就是把jq的查询写到括号里面了
        Document document = Jsoup.parse(new File(path), "utf-8");
        // 查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("-------------");
        // 查询ID值为itcast的元素
        Elements elements1 = document.select("#itcast");
        System.out.println(elements1);
        System.out.println("-------------");
        // 获取student标签并且number属性值为heima_001
        Elements elements2 = document.select("student[number='heima_001']");
        System.out.println(elements2);

    }
}
