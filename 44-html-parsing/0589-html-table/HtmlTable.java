//JAVA 26
// Java — jsoup via jbang. Run: jbang HtmlTable.java
//DEPS org.jsoup:jsoup:1.18.1
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.util.*;

void main() {
  var DOC = "<table><tr><td>r1c1</td><td>r1c2</td></tr><tr><td>r2c1</td><td>r2c2</td></tr></table>";
  var d = Jsoup.parse(DOC);
  var cells = new StringJoiner(",");
  for (var td : d.select("td")) cells.add(td.text());
  System.out.println(cells);
}
