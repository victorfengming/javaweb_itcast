package cn.itcast.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project javaweb_itcast
 * @package cn.itcast.xml.jsoup
 * @created 2019-11-12 10:49
 * @function "XPath查询"
 */
public class JsoupDemo06 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        // 1. 获取student.xml的path
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        // 2. 获取Document对象
        // 其实就是把jq的查询写到括号里面了
        Document document = Jsoup.parse(new File(path), "utf-8");
        // 3.根据document对象,创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        // 4. 结合xpath语法查询
        List<JXNode> jxNodes = jxDocument.selN("");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
            jxNode.getElement();
        }


    }
}
