# 0485 — Valid input

Validate a schema with the real Hibernate Validator (Jakarta Bean Validation) library. This lesson defines a `Model` with `@Size(min = 3)` on `name` and `@Min(0) @Max(120)` on `age`, then validates the valid input `{name: alice, age: 30}` via `Validator.validate(...)`. The output is the sorted, lowercased failing field name(s) extracted from the constraint violations' `getPropertyPath()`; when there are no violations the input passes and it prints `ok`. Uses the real `org.hibernate.validator:hibernate-validator` library.

## Run

    jbang ValidInput.java
