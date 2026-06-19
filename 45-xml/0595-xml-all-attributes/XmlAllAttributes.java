import javax.xml.parsers.*; import org.w3c.dom.*; import java.io.*; import java.util.*;

public class XmlAllAttributes {
  public static void main(String[] a) throws Exception {
    String DOC = "<catalog>\n"
               + "  <book id=\"b1\" lang=\"en\"><title>Go</title><price>30</price></book>\n"
               + "  <book id=\"b2\" lang=\"fr\"><title>Rust</title><price>45</price></book>\n"
               + "</catalog>";
    Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                 .parse(new ByteArrayInputStream(DOC.getBytes()));
    NodeList bs = d.getElementsByTagName("book");
    StringJoiner ids = new StringJoiner(",");
    for (int i = 0; i < bs.getLength(); i++) {
      ids.add(((Element) bs.item(i)).getAttribute("id"));
    }
    System.out.println(ids);
  }
}
