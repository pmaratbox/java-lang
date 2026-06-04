# 0106 — Producer / Consumer

A producer sends 1..5 to a consumer that sums them, printing `15`. A bounded `ArrayBlockingQueue` back-pressures the producer when full, classic producer/consumer in Java.

## Run

    javac Consumer.java && java Consumer
