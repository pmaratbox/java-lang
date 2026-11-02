//JAVA 26
//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface Widget { String value(); }

public class DiFactory {

  // Factory provider: Guice calls this method to CONSTRUCT the Widget,
  // instead of plain autowiring of a concrete class.
  static class WidgetModule extends AbstractModule {
    @Provides
    Widget makeWidget() {
      return new Widget() {
        public String value() { return "built"; }
      };
    }
  }

  void main() {
    var inj = Guice.createInjector(new WidgetModule());
    var widget = inj.getInstance(Widget.class);
    System.out.println(widget.value());
  }
}
