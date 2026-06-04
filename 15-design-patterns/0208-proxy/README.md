# 0208 — Virtual Proxy

Use a lazy virtual proxy that loads the real subject only on first access, printing `loaded`. The proxy holds a null reference and constructs the real subject on the first request().

## Run

    javac Proxy.java && java Proxy
