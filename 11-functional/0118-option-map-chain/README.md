# 0118 — Option Map Chaining

Map a function over a present optional (10 -> 12) and an absent one (-> fallback), printing `12 none`. map (+2) over Some(10) -> 12; over None -> unwrap_or "none"; print both.

## Run

    javac MapChain.java && java MapChain
