// Java — DOM (javax.xml.parsers + org.w3c.dom, JDK stdlib). No //DEPS needed.
import javax.xml.parsers.*; import org.w3c.dom.*; import java.io.*;
public class XmlAttribute {
  public static void main(String[] a) throws Exception {
    String DOC = "<catalog>\n"
               + "  <book id=\"b1\" lang=\"en\"><title>Go</title><price>30</price></book>\n"
               + "  <book id=\"b2\" lang=\"fr\"><title>Rust</title><price>45</price></book>\n"
               + "</catalog>";
    Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                 .parse(new ByteArrayInputStream(DOC.getBytes()));
    Element first = (Element) d.getElementsByTagName("book").item(0);
    System.out.println(first.getAttribute("id"));   // b1
  }
}
