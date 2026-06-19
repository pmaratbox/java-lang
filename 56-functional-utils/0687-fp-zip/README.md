# 0687 — Zip

This lesson uses the **Vavr** functional collection library and its `zip` transform. `List.zip` pairs the elements of two lists positionally into a `List` of `Tuple2`; we then `map` each pair to `<n><s>` and join with commas to get `1a,2b,3c`.

## Run

    jbang FpZip.java
