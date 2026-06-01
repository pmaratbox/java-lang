# 0042 — Environment Variables

Read the environment variable `LESSON_ENV_VAR`, falling back to `default` when it is unset, and print `value: default`. `System.getenv(name)` returns the value or `null`; using `System.getenv()` (the whole map) with `getOrDefault` supplies the fallback in one call. The environment is read-only in Java.

## Run

    javac EnvVars.java && java EnvVars
