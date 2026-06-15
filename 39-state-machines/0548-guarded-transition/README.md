# 0548 — Guarded transition

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel) finite
state machine library. We model a door with three states (`locked`,
`unlocked`, `open`). A *guarded transition* here means an event is only valid
from a specific state: the `open` event is defined solely as a transition out
of `unlocked`, so firing `open` while `locked` would be a no-op. Starting in
`locked`, we fire `unlock` (to `unlocked`) then `open` (to `open`). The final
state is read back from the machine via `getCurrentState()` (never hardcoded).

## Run

    jbang GuardedTransition.java
