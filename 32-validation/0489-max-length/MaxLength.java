//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

public class MaxLength {
  static class Model {
    @Size(max = 5) String code;
    Model(String code) { this.code = code; }
  }

  public static void main(String[] args) {
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    // code "ABCDEFG" has length 7, exceeds max length 5
    var violations = validator.validate(new Model("ABCDEFG"));
    String out = violations.stream()
        .map(v -> v.getPropertyPath().toString())
        .map(String::toLowerCase)
        .distinct()
        .sorted()
        .collect(Collectors.joining("\n"));
    System.out.println(out.isEmpty() ? "ok" : out);
  }
}
