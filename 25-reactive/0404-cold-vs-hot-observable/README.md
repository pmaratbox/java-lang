# 0404 — Cold vs Hot Observable

Contrast a cold observable (re-runs its producer per subscriber) with a hot one (shares a single execution, so late subscribers miss earlier values). In Java the cold producer is a `Consumer<Consumer<Integer>>` re-invoked per subscribe, while the hot one keeps a shared subscriber list and pushes via `emit`.

## Run

    javac ColdVsHotObservable.java && java ColdVsHotObservable
