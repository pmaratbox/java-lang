//JAVA 26
//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;

interface Repo { String data(); }

class RepoImpl implements Repo {
  public String data() { return "data"; }
}

class Service {
  @Inject Repo repo;
  String run() { return repo.data(); }
}

public class DiDependency {
  void main() {
    var inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(Repo.class).to(RepoImpl.class).in(Scopes.SINGLETON);
      }
    });
    // Service depends on Repo; Guice resolves the graph and injects RepoImpl.
    var service = inj.getInstance(Service.class);
    IO.println(service.run());
  }
}
