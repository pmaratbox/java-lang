# 0125 — Temp File Roundtrip

Write a string to a temporary file, read it back, confirm it matches, delete the file, and print `roundtrip: ok`. `Files.createTempFile` plus `writeString`/`readString` make the roundtrip concise.

## Run

    javac FileRoundtrip.java && java FileRoundtrip
