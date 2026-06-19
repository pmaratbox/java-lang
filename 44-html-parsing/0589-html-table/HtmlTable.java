// Java — jsoup via jbang. Run: jbang HtmlTable.java
//DEPS org.jsoup:jsoup:1.18.1
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.util.*;

public class HtmlTable {
  public static void main(String[] a) {
    String DOC = "<table><tr><td>r1c1</td><td>r1c2</td></tr><tr><td>r2c1</td><td>r2c2</td></tr></table>";
    Document d = Jsoup.parse(DOC);
    StringJoiner cells = new StringJoiner(",");
    for (Element td : d.select("td")) cells.add(td.text());
    System.out.println(cells);
  }
}
