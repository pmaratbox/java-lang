# 0215 — Chain of Responsibility

Pass a request of level 2 along a handler chain so the level-2 handler handles it, printing `handled by 2`. Each Handler either handles a matching level or forwards to its next link.

## Run

    javac ChainOfResponsibility.java && java ChainOfResponsibility
