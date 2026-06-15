//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

public class EmailFormat {
  static class Model {
    @Email String email;
    Model(String e) { email = e; }
  }

  public static void main(String[] args) {
    Validator v = Validation.buildDefaultValidatorFactory().getValidator();
    var violations = v.validate(new Model("not-an-email"));
    String out = violations.stream()
        .map(x -> x.getPropertyPath().toString().toLowerCase())
        .distinct().sorted()
        .collect(Collectors.joining("\n"));
    System.out.println(out.isEmpty() ? "ok" : out);
  }
}
