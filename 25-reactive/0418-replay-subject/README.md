# 0418 — ReplaySubject

Implement a ReplaySubject with a buffer of the last 2 values, replayed to a late subscriber, which then also receives new values. A bounded `ArrayDeque` holds the replay buffer, evicting the oldest value before each new push.

## Run

    javac ReplaySubject.java && java ReplaySubject
