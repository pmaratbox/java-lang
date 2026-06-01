# 0021 — Mutability & References

Have a function increment a value in place — through a pointer, reference, or mutable holder — so the caller sees it change from `before: 1` to `after: 2`. Java is strictly pass-by-value; for objects the *reference* is copied, so callee and caller point at the same array and mutating `box[0]` is visible — but reassigning the parameter would not be. A bare `int` is copied wholesale, so a mutable holder (here `int[]`) is needed.

## Run

    javac References.java && java References
