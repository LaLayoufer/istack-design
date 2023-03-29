package com.istack.design.creationalpattern.abstractfactory.config;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {



    public static Object getBean() {
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder= null;
        try {
            builder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=builder.parse(new File("Config\\config.xml"));

            //
            NodeList nodeList=document.getElementsByTagName("className");
            Node node=nodeList.item(0).getFirstChild();
            String cName=node.getNodeValue();

            Class c=Class.forName(cName);
            Object object=c.newInstance();
            return object;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

             return null;
    }
}
