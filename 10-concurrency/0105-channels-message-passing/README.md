# 0105 — Channels / Message Passing

Send the values 1, 2, 3 through a channel (or queue) from one thread and receive them in order, printing `1 2 3`. Java has no channels, but a `BlockingQueue` plays the same role with `put`/`take` blocking until elements are available.

## Run

    javac MessagePassing.java && java MessagePassing
