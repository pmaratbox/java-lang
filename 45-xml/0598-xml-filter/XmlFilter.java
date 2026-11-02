//JAVA 26
// Java — DOM (javax.xml.parsers + org.w3c.dom, JDK stdlib). Run: jbang XmlFilter.java
import javax.xml.parsers.*; import org.w3c.dom.*; import java.io.*; import java.util.*;
static String text(Element b, String tag){ return b.getElementsByTagName(tag).item(0).getTextContent(); }
void main() throws Exception {
  var DOC = "<catalog>\n  <book id=\"b1\" lang=\"en\"><title>Go</title><price>30</price></book>\n"
             + "  <book id=\"b2\" lang=\"fr\"><title>Rust</title><price>45</price></book>\n</catalog>";
  var d = DocumentBuilderFactory.newInstance().newDocumentBuilder()
               .parse(new ByteArrayInputStream(DOC.getBytes()));
  var bs = d.getElementsByTagName("book");
  var en = new StringJoiner(",");
  for (var i = 0; i < bs.getLength(); i++) {
    var b = (Element) bs.item(i);
    if (b.getAttribute("lang").equals("en")) en.add(text(b, "title"));
  }
  IO.println(en);   // Go
}
