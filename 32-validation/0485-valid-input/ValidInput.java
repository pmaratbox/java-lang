//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

public class ValidInput {
  static class Model {
    @Size(min = 3) String name;
    @Min(0) @Max(120) int age;
    Model(String n, int a) { name = n; age = a; }
  }

  public static void main(String[] a) {
    Validator v = Validation.buildDefaultValidatorFactory().getValidator();
    // Validate a VALID input {name: alice, age: 30}.
    var violations = v.validate(new Model("alice", 30));
    String fields = violations.stream()
        .map(x -> x.getPropertyPath().toString().toLowerCase())
        .distinct().sorted()
        .collect(Collectors.joining("\n"));
    System.out.println(fields.isEmpty() ? "ok" : fields);
  }
}
