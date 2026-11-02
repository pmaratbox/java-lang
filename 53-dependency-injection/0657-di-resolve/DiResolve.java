//JAVA 26
//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface Greeter { String greet(); }

class GreeterImpl implements Greeter {
  public String greet() { return "hello"; }
}

public class DiResolve {
  void main() {
    var inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(Greeter.class).to(GreeterImpl.class).in(Scopes.SINGLETON);
      }
    });
    var greeter = inj.getInstance(Greeter.class);
    System.out.println(greeter.greet());
  }
}
