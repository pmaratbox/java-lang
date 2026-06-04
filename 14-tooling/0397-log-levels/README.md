# 0397 — Log Level Filter

With a threshold of WARN, log messages at INFO, WARN, and ERROR but only emit WARN and ERROR, on two lines. An enum's natural ordinal ordering makes the threshold comparison idiomatic in Java.

## Run

    javac LogLevels.java && java LogLevels
