//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface Greeter { String greet(); }

class GreeterImpl implements Greeter {
  public String greet() { return "hello"; }
}

public class DiResolve {
  public static void main(String[] args) {
    Injector inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(Greeter.class).to(GreeterImpl.class).in(Scopes.SINGLETON);
      }
    });
    Greeter greeter = inj.getInstance(Greeter.class);
    System.out.println(greeter.greet());
  }
}
