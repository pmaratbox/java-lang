// Java — commonmark-java via jbang. Run: jbang MdHeading.java
//DEPS org.commonmark:commonmark:0.24.0
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MdHeading {
  static String render(String src) {
    Parser p = Parser.builder().build();
    HtmlRenderer h = HtmlRenderer.builder().build();
    return h.render(p.parse(src)).replaceAll("\n+$", "");
  }
  public static void main(String[] a) {
    System.out.println(render("# Hello"));   // <h1>Hello</h1>
  }
}
