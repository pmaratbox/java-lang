# 0552 — Workflow

Uses the [squirrel-foundation](https://github.com/hekailiang/squirrel)
finite-state-machine library to model a multi-step approval workflow. An
`UntypedStateMachineBuilder` declares two external transitions —
`idle --submit--> pending` and `pending --approve--> approved` — which together
form the FSM's state graph. The machine starts in `idle`, then firing the fixed
event sequence `submit` and `approve` drives it through `pending` to the final
`approved` state, whose name is read back from the machine and lowercased.

## Run

    jbang Workflow.java
