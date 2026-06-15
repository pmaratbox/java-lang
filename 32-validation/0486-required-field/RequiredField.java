//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

public class RequiredField {
  static class Model {
    @NotNull String name;
    @NotNull Integer age;
    Model(String name, Integer age) { this.name = name; this.age = age; }
  }

  public static void main(String[] args) {
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    // name present, age MISSING (null)
    var violations = validator.validate(new Model("ada", null));
    String out = violations.stream()
        .map(v -> v.getPropertyPath().toString())
        .map(String::toLowerCase)
        .distinct()
        .sorted()
        .collect(Collectors.joining("\n"));
    System.out.println(out.isEmpty() ? "ok" : out);
  }
}
