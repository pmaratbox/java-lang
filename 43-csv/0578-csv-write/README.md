# 0578 — Write CSV

Uses the real CSV library [OpenCSV](https://github.com/opencsv/opencsv) to write
two rows — `["name", "age"]` then `["Alice", "30"]` — with `CSVWriter`. Since
OpenCSV quotes every field by default, the writer is built with
`NO_QUOTE_CHARACTER` and `NO_ESCAPE_CHARACTER` so simple fields stay unquoted.
The serialized text is captured, its `\r\n` line endings are normalized to `\n`,
the trailing newline is stripped, and the result is printed — produced by the
library writer, never hardcoded.

## Run

    jbang CsvWrite.java
