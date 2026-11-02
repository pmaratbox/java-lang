//JAVA 26
// Java — commonmark-java via jbang. Run: jbang MdBlockquote.java
//DEPS org.commonmark:commonmark:0.24.0
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

static String render(String src) {
  var p = Parser.builder().build();
  var h = HtmlRenderer.builder().build();
  return h.render(p.parse(src)).replaceAll("\n+$", "");
}

void main() {
  System.out.println(render("> quote"));
}
