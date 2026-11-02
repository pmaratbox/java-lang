//JAVA 26
//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

static class Model {
  @Size(min = 3) String name;
  @Min(0) @Max(120) int age;
  Model(String n, int a) { name = n; age = a; }
}

void main() {
  var v = Validation.buildDefaultValidatorFactory().getValidator();
  var violations = v.validate(new Model("al", 30));
  var out = violations.stream()
      .map(x -> x.getPropertyPath().toString().toLowerCase())
      .distinct().sorted()
      .collect(Collectors.joining("\n"));
  IO.println(out.isEmpty() ? "ok" : out);
}
