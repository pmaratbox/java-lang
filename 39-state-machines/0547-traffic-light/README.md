# 0547 — Traffic light

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel)
finite-state-machine library. We define three states (`red`, `green`,
`yellow`) and wire `externalTransition()` edges so that each `next` event
moves the machine to the following colour, cycling
`red -> green -> yellow -> red`. Starting in `red`, firing `next` TWICE
drives the FSM to `yellow`, and we print the resulting state name lowercased.

## Run

    jbang TrafficLight.java
