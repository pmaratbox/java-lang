# 0546 — Toggle

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel)
finite-state-machine library. An `UntypedStateMachineBuilder` declares two
states, `off` and `on`, joined by external transitions that both react to a
single `toggle` event — firing it flips the machine between the two states.
Starting in `off` and firing `toggle` three times walks `off -> on -> off ->
on`, and the resulting state (read back from the machine) is printed
lowercased.

## Run

    jbang Toggle.java
