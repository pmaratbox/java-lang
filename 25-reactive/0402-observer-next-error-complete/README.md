# 0402 — Observer Contract

Demonstrate the observer contract next*-then-terminal: emit 1 and 2, complete, and show that a post-complete next is ignored. A `SafeObserver` wrapper flips a `stopped` boolean on the first terminal so later `next`/terminal calls become no-ops.

## Run

    javac ObserverNextErrorComplete.java && java ObserverNextErrorComplete
