# 0391 — URL Percent-Encode

Percent-encode the string "a b&c" to `a%20b%26c`. In Java, keep unreserved chars and emit `%` plus uppercase hex for the rest.

## Run

    javac UrlEncode.java && java UrlEncode
