//JAVA 26
import javax.xml.parsers.*; import org.w3c.dom.*; import java.io.*;
static String text(Element b, String tag){ return b.getElementsByTagName(tag).item(0).getTextContent(); }
void main() throws Exception {
  var DOC = "<catalog>\n"
             + "  <book id=\"b1\" lang=\"en\"><title>Go</title><price>30</price></book>\n"
             + "  <book id=\"b2\" lang=\"fr\"><title>Rust</title><price>45</price></book>\n"
             + "</catalog>";
  var d = DocumentBuilderFactory.newInstance().newDocumentBuilder()
               .parse(new ByteArrayInputStream(DOC.getBytes()));
  var bs = d.getElementsByTagName("book");
  var first = (Element) bs.item(0);
  System.out.println(text(first, "price"));
}
