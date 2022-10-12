package Day16;

/*
 ** @author LiGuanda
 ** @date  PM 5:29:03
 ** @description This is a description of XMLTest
 ** @params
 ** @return
 ** @since version-1.0  */


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author Lenovo
 */
public class XMLTest {


    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = null;
        try {

            builder = factory.newDocumentBuilder();

        } catch (ParserConfigurationException e) {

            System.out.println("---->ParserConfigurationException");
            return;

        }
        builder.setErrorHandler(new ErrorHandler() {


            @Override
            public void warning(SAXParseException exception) {

                System.out.println("---->WARNING : " + exception.getCause());
                return;

            }


            @Override
            public void error(SAXParseException exception) {

                System.out.println("---->ERROR : " + exception.getCause());
                return;

            }


            @Override
            public void fatalError(SAXParseException exception) {

                System.out.println("---->FATAL_ERROR : " + exception.getCause());
                return;

            }


        });
        File file = new File("src/main/resources/Day16/day16.xml");
        Document document = null;
        try {

            document = builder.parse(file);

        } catch (SAXException | IOException e) {

            System.out.println("---->SAXException");
            return;

        }
        String version = document.getXmlVersion();
        System.out.println(version);
        Element root = document.getDocumentElement();
        NodeList childNodes = root.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {

            //System.out.println(childNodes.item(i));
            String nodeName = childNodes.item(i).getNodeName();
            String nodeValue = childNodes.item(i).getNodeValue();
            System.out.println("nodeName = " + nodeName);
            System.out.println("nodeValue = " + nodeValue);
            NodeList childNodes1 = childNodes.item(i).getChildNodes();
            for (int j = 0; j < childNodes1.getLength(); j++) {

                System.out.println("childNodeValue = " + childNodes1.item(j).getNodeValue());

            }

        }

    }


}
