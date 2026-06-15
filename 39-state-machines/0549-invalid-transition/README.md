# 0549 — Invalid transition

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel) finite
state machine library. We model the same turnstile as 0545 with two states
(`locked`, `unlocked`) and two external transitions: `locked --coin--> unlocked`
and `unlocked --push--> locked`. Starting in `locked` we fire `push`, an event
that has *no* transition defined from `locked`. The FSM treats this as an
*invalid transition*: the event is rejected and the machine simply stays in its
current state instead of moving or crashing. The final state is read back from
the machine via `getCurrentState()` (never hardcoded) and prints `locked`.

## Run

    jbang InvalidTransition.java
