//JAVA 26
//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface Repo { String data(); }
class RepoImpl implements Repo { public String data() { return "rows"; } }

public class DiSingleton {
  void main() {
    var inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(Repo.class).to(RepoImpl.class).in(Scopes.SINGLETON);
      }
    });
    // Resolve the same singleton-scoped binding twice through the container.
    var first = inj.getInstance(Repo.class);
    var second = inj.getInstance(Repo.class);
    System.out.println(first == second); // true
  }
}
