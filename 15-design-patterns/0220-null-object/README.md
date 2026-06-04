# 0220 — Null Object

Compare a no-op null logger with a real logger; only the real one records, so print the logged count `1`. The NullLogger satisfies the Logger interface but does nothing, so no null checks are needed.

## Run

    javac NullObject.java && java NullObject
