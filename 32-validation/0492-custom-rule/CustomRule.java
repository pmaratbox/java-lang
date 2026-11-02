//JAVA 26
//DEPS org.hibernate.validator:hibernate-validator:8.0.1.Final
//DEPS org.glassfish.expressly:expressly:5.0.0
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import java.lang.annotation.*;
import java.util.stream.*;


// Custom constraint: the annotated string must contain at least one digit.
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = HasDigitValidator.class)
@interface HasDigit {
  String message() default "must contain a digit";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}

public static class HasDigitValidator implements ConstraintValidator<HasDigit, String> {
  public boolean isValid(String value, ConstraintValidatorContext ctx) {
    return value != null && value.chars().anyMatch(Character::isDigit);
  }
}

static class Model {
  @HasDigit String password;
  Model(String p) { password = p; }
}

void main() {
  var v = Validation.buildDefaultValidatorFactory().getValidator();
  var violations = v.validate(new Model("abcdef"));
  var out = violations.stream()
      .map(x -> x.getPropertyPath().toString())
      .distinct()
      .map(String::toLowerCase)
      .sorted()
      .collect(Collectors.joining("\n"));
  IO.println(out.isEmpty() ? "ok" : out);
}
