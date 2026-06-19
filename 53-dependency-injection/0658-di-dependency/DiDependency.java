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
  public static void main(String[] args) {
    Injector inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(Repo.class).to(RepoImpl.class).in(Scopes.SINGLETON);
      }
    });
    // Service depends on Repo; Guice resolves the graph and injects RepoImpl.
    Service service = inj.getInstance(Service.class);
    System.out.println(service.run());
  }
}
