# 0417 — BehaviorSubject

Implement a BehaviorSubject that holds a current value and replays it immediately to each new subscriber. In Java the subject keeps a list of `Consumer<T>` observers and pushes the seeded current value on subscribe.

## Run

    javac BehaviorSubject.java && java BehaviorSubject
