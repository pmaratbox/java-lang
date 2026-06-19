// Java — commonmark-java via jbang. Run: jbang MdInlineCode.java
//DEPS org.commonmark:commonmark:0.24.0
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MdInlineCode {
  static String render(String src) {
    Parser p = Parser.builder().build();
    HtmlRenderer h = HtmlRenderer.builder().build();
    return h.render(p.parse(src)).replaceAll("\n+$", "");
  }
  public static void main(String[] a) {
    System.out.println(render("`code`"));   // <p><code>code</code></p>
  }
}
