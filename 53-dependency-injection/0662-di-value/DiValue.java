//DEPS com.google.inject:guice:7.0.0
import com.google.inject.*;
import com.google.inject.name.*;

class Config {
  @Inject @Named("apiKey") String value;
  String get() { return value; }
}

public class DiValue {
  public static void main(String[] args) {
    Injector inj = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bindConstant().annotatedWith(Names.named("apiKey")).to("v1");
      }
    });
    Config config = inj.getInstance(Config.class);
    System.out.println(config.get());
  }
}
