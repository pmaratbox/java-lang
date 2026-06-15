# 0550 — Transition count

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel) finite
state machine library. We chain three external transitions
(`a --go--> b --go--> c --go--> d`) and attach a *transition action* to each via
`.callMethod("onStep")`. A transition action is a callback the FSM invokes every
time that transition is taken; here it increments a counter field on the machine
instance. Firing `go` three times walks the machine through all three
transitions, and the counter — read back from the machine, never hardcoded —
ends at `3`.

## Run

    jbang TransitionCount.java
