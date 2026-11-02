//JAVA 26
//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.util.stream.*;

static class Model {
  @Email String email;
  Model(String e) { email = e; }
}

void main() {
  var v = Validation.buildDefaultValidatorFactory().getValidator();
  var violations = v.validate(new Model("not-an-email"));
  var out = violations.stream()
      .map(x -> x.getPropertyPath().toString().toLowerCase())
      .distinct().sorted()
      .collect(Collectors.joining("\n"));
  IO.println(out.isEmpty() ? "ok" : out);
}
