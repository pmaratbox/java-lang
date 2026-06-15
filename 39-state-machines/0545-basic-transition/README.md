# 0545 — Basic transition

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel) finite
state machine library. We model a turnstile with two states (`locked`,
`unlocked`) and two external transitions: `locked --coin--> unlocked` and
`unlocked --push--> locked`. A *transition* is the FSM concept of moving from
one state to another when a named event fires. Starting in `locked` and firing
`coin` drives the machine into `unlocked`; the final state is read back from the
machine via `getCurrentState()` (never hardcoded).

## Run

    jbang BasicTransition.java
