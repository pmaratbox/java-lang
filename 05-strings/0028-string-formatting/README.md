# 0028 — String Formatting

Format the float `3.14159` to two decimals and zero-pad the integer `42` to width five, printing `pi: 3.14` and `id: 00042`. `printf`/`String.format` use the same conversion mini-language: `%.2f` fixes two decimals, `%05d` zero-pads to width 5, and `%n` is the platform newline. A `Locale` argument (`Locale.US`) forces a dot decimal mark.

## Run

    javac Formatting.java && java Formatting
