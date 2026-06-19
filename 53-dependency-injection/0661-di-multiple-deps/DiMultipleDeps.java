//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface A { String x(); }
interface B { String y(); }

class AImpl implements A {
  public String x() { return "a"; }
}

class BImpl implements B {
  public String y() { return "b"; }
}

class Service {
  @Inject A a;
  @Inject B b;
  String run() { return a.x() + b.y(); }
}

public class DiMultipleDeps {
  public static void main(String[] args) {
    Injector inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(A.class).to(AImpl.class).in(Scopes.SINGLETON);
        bind(B.class).to(BImpl.class).in(Scopes.SINGLETON);
      }
    });
    Service service = inj.getInstance(Service.class);
    System.out.println(service.run());
  }
}
