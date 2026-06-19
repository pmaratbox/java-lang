import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XmlElementText {
  public static void main(String[] args) throws Exception {
    String DOC = "<catalog>\n"
        + "  <book id=\"b1\" lang=\"en\"><title>Go</title><price>30</price></book>\n"
        + "  <book id=\"b2\" lang=\"fr\"><title>Rust</title><price>45</price></book>\n"
        + "</catalog>";

    Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder()
        .parse(new ByteArrayInputStream(DOC.getBytes()));

    Element firstBook = (Element) d.getElementsByTagName("book").item(0);
    String title = firstBook.getElementsByTagName("title").item(0).getTextContent();
    System.out.println(title);
  }
}
