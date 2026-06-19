//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

class A {
  String v() { return "a"; }
}

class B {
  @Inject A a;
  String v() { return a.v() + "b"; }
}

class C {
  @Inject B b;
  String v() { return b.v() + "c"; }
}

public class DiNested {
  public static void main(String[] args) {
    Injector inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        // No bindings needed: Guice resolves concrete classes by injecting their @Inject fields.
      }
    });
    // C depends on B depends on A — a 3-level chain.
    // Guice resolves the whole graph when we ask for C.
    C c = inj.getInstance(C.class);
    System.out.println(c.v());
  }
}
