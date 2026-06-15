# 0489 — Maximum length

Validate a string's maximum length with the real Hibernate Validator (Jakarta Bean Validation). The `code` field carries `@Size(max = 5)`, and the input `{code: "ABCDEFG"}` is 7 characters long, so the constraint fails. The program runs the validator and prints the failing field name(s) — taken from each violation's property path, lowercased and sorted — or `ok` if validation passes. It never prints library message text.

## Run

    jbang MaxLength.java
