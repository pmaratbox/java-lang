# 0486 — Required field

Validate that required fields are present using the real Hibernate Validator (Jakarta Bean Validation) library. The schema requires both `name` and `age` via the `@NotNull` constraint from `jakarta.validation.constraints`. This lesson validates input where `name` is present but `age` is missing (null), so the `@NotNull` constraint on `age` fails. The output is the failing field name(s) — extracted from each constraint violation's property path, lowercased and sorted — or `ok` if validation passes.

## Run

    jbang RequiredField.java
