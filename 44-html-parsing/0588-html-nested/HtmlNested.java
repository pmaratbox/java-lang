// Java — jsoup via jbang. Run: jbang HtmlNested.java
//DEPS org.jsoup:jsoup:1.18.1
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.util.*;

public class HtmlNested {
  public static void main(String[] a) {
    String DOC = "<html><body>\n<h1>Hello</h1>\n<span id=\"status\">active</span>\n"
      + "<ul class=\"items\">\n<li class=\"item\">apple</li>\n<li class=\"item\">banana</li>\n<li class=\"item\">cherry</li>\n</ul>\n"
      + "<a href=\"https://example.com\">site</a>\n<div class=\"content\"><p>first</p><p>second</p></div>\n</body></html>";
    Document d = Jsoup.parse(DOC);
    StringJoiner sj = new StringJoiner(",");
    for (Element e : d.select(".content p")) sj.add(e.text());
    System.out.println(sj);
  }
}
