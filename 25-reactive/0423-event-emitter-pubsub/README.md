# 0423 — EventEmitter (Pub/Sub)

Build a multi-topic EventEmitter with on(topic, handler), emit(topic, payload), and off(topic, handler). A `Map<String, List<Consumer<String>>>` holds handlers per topic and `off` removes by identity.

## Run

    javac EventEmitterPubsub.java && java EventEmitterPubsub
