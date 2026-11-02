//JAVA 26
//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface Animal { String sound(); }

class Dog implements Animal {
  public String sound() { return "woof"; }
}

public class DiInterface {
  void main() {
    var inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(Animal.class).to(Dog.class).in(Scopes.SINGLETON);
      }
    });
    var animal = inj.getInstance(Animal.class);
    System.out.println(animal.sound());
  }
}
