# 0346 — Newtype Wrapper

Wrap raw integers in distinct UserId and ProductId types so they cannot be confused, printing `user-1 prod-2`. Single-field records with custom toString give Java distinct, unconfusable wrapper types.

## Run

    javac NewtypeWrapper.java && java NewtypeWrapper
