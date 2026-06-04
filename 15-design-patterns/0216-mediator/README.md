# 0216 — Mediator

Have colleague A send "hi" through a mediator to colleague B, which prints `B got: hi`. Colleagues never reference each other directly; the ChatMediator routes the message between them.

## Run

    javac Mediator.java && java Mediator
