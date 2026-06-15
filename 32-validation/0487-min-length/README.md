# 0487 — Minimum length

Validate an object with the real Hibernate Validator (Jakarta Bean Validation) library. This lesson annotates the `name` field with `@Size(min = 3)` and validates the fixed input `{name: 'al', age: 30}`. Because `name` is only 2 characters long the `@Size` constraint is violated, so the validator reports a `ConstraintViolation`. The output is the failing field name(s) extracted from each violation's `getPropertyPath()` (lowercased, deduped, sorted), or `ok` when validation passes.

## Run

    jbang MinLength.java
