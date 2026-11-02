# 0130 — Format ISO Date

Format the date y=2026, m=6, d=4 as a zero-padded ISO string `2026-06-04`. `String.formatted` with `%04d` and `%02d` width specifiers zero-pads the fields, and `IO.println` prints the result.

## Run

    javac IsoDate.java && java IsoDate
