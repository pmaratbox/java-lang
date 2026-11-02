//JAVA 26
// Java — jsoup via jbang. Run: jbang HtmlNested.java
//DEPS org.jsoup:jsoup:1.18.1
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.util.*;

void main() {
  var DOC = "<html><body>\n<h1>Hello</h1>\n<span id=\"status\">active</span>\n"
    + "<ul class=\"items\">\n<li class=\"item\">apple</li>\n<li class=\"item\">banana</li>\n<li class=\"item\">cherry</li>\n</ul>\n"
    + "<a href=\"https://example.com\">site</a>\n<div class=\"content\"><p>first</p><p>second</p></div>\n</body></html>";
  var d = Jsoup.parse(DOC);
  var sj = new StringJoiner(",");
  for (var e : d.select(".content p")) sj.add(e.text());
  IO.println(sj);
}
