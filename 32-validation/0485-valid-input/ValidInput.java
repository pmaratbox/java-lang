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
  // Validate a VALID input {name: alice, age: 30}.
  var violations = v.validate(new Model("alice", 30));
  var fields = violations.stream()
      .map(x -> x.getPropertyPath().toString().toLowerCase())
      .distinct().sorted()
      .collect(Collectors.joining("\n"));
  System.out.println(fields.isEmpty() ? "ok" : fields);
}
