# 0403 — Subscribe and Unsubscribe

Return a Subscription from subscribe() and use it to unsubscribe so later values are not delivered. In Java the Observer binds the Subscription and the producer checks its closed flag before each next().

## Run

    javac SubscribeUnsubscribe.java && java SubscribeUnsubscribe
