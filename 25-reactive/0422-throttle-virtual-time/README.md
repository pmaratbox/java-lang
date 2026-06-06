# 0422 — Throttle (Virtual Time)

Implement throttle(window) (leading edge) on a virtual-time scheduler: emit a value, then suppress further values for `window` ticks. A captured `long[]` cell holds `blockUntil` so the returned `Consumer<String>` lambda can mutate it across emissions.

## Run

    javac ThrottleVirtualTime.java && java ThrottleVirtualTime
