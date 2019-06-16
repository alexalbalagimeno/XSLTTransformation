package alex;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
 
/**
* Created by Alex on 08/04/2018.
*/
public class XsltTransformation {
 
  private static Document document;
 
  public static void main(String[] args) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 
    File xml = new File("C:\\Users\\Alex\\Documents\\CFGS DAM\\2on DAM\\Eclipse\\AccésADades\\XSLTTansformation\\Premis_Nobel.xml");
    File xsl = new File("C:\\Users\\Alex\\Documents\\CFGS DAM\\2on DAM\\Eclipse\\AccésADades\\XSLTTansformation\\A32_AlexAlbala.xsl");
 
    DocumentBuilder builder = factory.newDocumentBuilder();
    document = builder.parse(xml);
 
    // Use a Transformer for output
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    StreamSource style = new StreamSource(xsl);
    Transformer transformer = transformerFactory.newTransformer(style);
 
    DOMSource source = new DOMSource(document);
    StreamResult result = new StreamResult(new File("C:\\Users\\Alex\\Documents\\CFGS DAM\\2on DAM\\Eclipse\\AccésADades\\XSLTTansformation\\Transformation.xml"));
    transformer.transform(source, result);
  }
}
