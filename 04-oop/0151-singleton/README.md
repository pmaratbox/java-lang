# 0151 — Singleton

Obtain a singleton instance twice and confirm both references are the same object, printing `same: yes`. A `private` constructor plus a lazy `static getInstance()` guarantees only one `Config` ever exists, so `==` identity holds.

## Run

    javac Singleton.java && java Singleton
