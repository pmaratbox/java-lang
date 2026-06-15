# 0491 — Multiple errors

Collect several validation errors at once with the real Hibernate Validator (Jakarta Bean Validation) library. This lesson constrains `name` with `@Size(min = 3)` and `age` with `@Min(0)`/`@Max(120)`, then validates `{name:"al", age:200}` so BOTH fields fail. Bean Validation reports ALL violations by default (no fail-fast), and the output is the sorted, lowercased set of failing field names — one per line — extracted from each violation's `getPropertyPath()`, or `ok` if validation passes.

## Run

    jbang MultipleErrors.java
