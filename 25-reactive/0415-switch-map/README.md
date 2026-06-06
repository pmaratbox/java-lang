# 0415 — SwitchMap

Implement switchMap: when a new outer value arrives, cancel the previous inner subscription before starting the new one. A held canceller Runnable marks the previous inner's pending Tasks dead in the virtual-time PriorityQueue before the next inner starts.

## Run

    javac SwitchMap.java && java SwitchMap
