# 0028 — String Formatting

Format the float `3.14159` to two decimals and zero-pad the integer `42` to width five, printing `pi: 3.14` and `id: 00042`. `String.format` and `String.formatted` share format specifiers: `%.2f` fixes two decimals and `%05d` zero-pads to width 5. Passing `Locale.US` to `String.format` forces a dot decimal mark. `IO.println` prints each formatted string and adds the platform newline.

## Run

    javac Formatting.java && java Formatting
