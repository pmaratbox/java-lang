# 0073 — Caesar Cipher

Encrypt `abc` with a Caesar cipher shifting each letter forward by `1` (wrapping within the alphabet) and print the result: `bcd`. `ch - 'a'` promotes to `int` giving `0..25`; `% 26` wraps before casting back to `char`.

## Run

    javac CaesarCipher.java && java CaesarCipher
