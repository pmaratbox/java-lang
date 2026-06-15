//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

public class MultipleErrors {
  static class Model {
    @Size(min = 3) String name;
    @Min(0) @Max(120) int age;
    Model(String n, int a) { name = n; age = a; }
  }

  public static void main(String[] args) {
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    var violations = validator.validate(new Model("al", 200));
    String out = violations.stream()
        .map(v -> v.getPropertyPath().toString().toLowerCase())
        .distinct()
        .sorted()
        .collect(Collectors.joining("\n"));
    System.out.println(out.isEmpty() ? "ok" : out);
  }
}
