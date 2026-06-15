# 0490 — Email format

Validate an object with Hibernate Validator (the reference implementation of Jakarta Bean Validation). The `email` field carries the `@Email` constraint and is set to the malformed value `not-an-email`, so the validator reports a constraint violation. The output is the failing field name(s) — the lowercased, sorted property paths pulled from the validator's violation objects — or `ok` when validation passes. Library message text is never printed.

## Run

    jbang EmailFormat.java
