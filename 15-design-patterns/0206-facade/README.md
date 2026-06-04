# 0206 — Facade

Expose a single facade call that starts three subsystems and reports `ready`. The facade's start() initializes each nested subsystem in turn and returns the result.

## Run

    javac Facade.java && java Facade
