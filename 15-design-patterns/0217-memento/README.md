# 0217 — Memento

Save state 1, change it to 2, then restore from the memento, printing current then restored `2 1`. The Originator captures its state into an immutable Mem and reloads it via restore().

## Run

    javac Memento.java && java Memento
