# 0488 — Number range

Validate a bean with the real Hibernate Validator (Jakarta Bean Validation) library. The `Person.age` field is annotated with `@Min(0)` and `@Max(120)`, so validating `{name: alice, age: 200}` produces a constraint violation on `age`. The output is the failing field name(s) extracted from each `ConstraintViolation` via `getPropertyPath()` (lowercased, sorted, one per line), or `ok` when validation passes — never the library-specific message text.

## Run

    jbang NumberRange.java
