# 0551 — Reset

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel)
finite-state-machine library. We declare two external transitions —
`idle --start--> running` and `running --reset--> idle` — then start the
machine in `idle` and fire the fixed sequence `start`, `reset`. The `reset`
event is the classic FSM idiom of returning the machine to its initial state,
so after both events the current state is `idle` (printed lowercased).

## Run

    jbang Reset.java
