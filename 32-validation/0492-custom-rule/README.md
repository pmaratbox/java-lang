# 0492 — Custom rule

Validate with the real Hibernate Validator (Jakarta Bean Validation) library using a custom constraint. This lesson defines a `@HasDigit` annotation backed by a `ConstraintValidator` that requires the value to contain at least one digit, and applies it to the `password` field. Validating `{password: "abcdef"}` fails the rule (no digit). The output is the failing field name(s) extracted from each violation's property path (lowercased, sorted), or `ok` if validation passes.

## Run

    jbang CustomRule.java
