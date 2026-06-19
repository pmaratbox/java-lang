// Java — DOM (javax.xml.parsers + org.w3c.dom, JDK stdlib). Run: jbang XmlFilter.java
import javax.xml.parsers.*; import org.w3c.dom.*; import java.io.*; import java.util.*;
public class XmlFilter {
  static String text(Element b, String tag){ return b.getElementsByTagName(tag).item(0).getTextContent(); }
  public static void main(String[] a) throws Exception {
    String DOC = "<catalog>\n  <book id=\"b1\" lang=\"en\"><title>Go</title><price>30</price></book>\n"
               + "  <book id=\"b2\" lang=\"fr\"><title>Rust</title><price>45</price></book>\n</catalog>";
    Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                 .parse(new ByteArrayInputStream(DOC.getBytes()));
    NodeList bs = d.getElementsByTagName("book");
    StringJoiner en = new StringJoiner(",");
    for (int i = 0; i < bs.getLength(); i++) {
      Element b = (Element) bs.item(i);
      if (b.getAttribute("lang").equals("en")) en.add(text(b, "title"));
    }
    System.out.println(en);   // Go
  }
}
