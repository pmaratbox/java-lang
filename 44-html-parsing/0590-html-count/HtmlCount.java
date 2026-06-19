// Java — jsoup via jbang. Run: jbang HtmlCount.java
//DEPS org.jsoup:jsoup:1.18.1
import org.jsoup.*;
import org.jsoup.nodes.*;

public class HtmlCount {
  public static void main(String[] args) {
    String DOC = "<html><body>\n<h1>Hello</h1>\n<span id=\"status\">active</span>\n"
      + "<ul class=\"items\">\n<li class=\"item\">apple</li>\n<li class=\"item\">banana</li>\n<li class=\"item\">cherry</li>\n</ul>\n"
      + "<a href=\"https://example.com\">site</a>\n<div class=\"content\"><p>first</p><p>second</p></div>\n</body></html>";
    Document d = Jsoup.parse(DOC);
    // CSS `.item` selects every element with class "item"; `.size()` counts the matches.
    System.out.println(d.select(".item").size());
  }
}
