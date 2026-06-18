# 0577 — Quoted CSV fields

Uses Java's real CSV library (*OpenCSV*, `com.opencsv.CSVReader`) to parse the
fixed CSV `name,note\nAlice,"hello, world"\n` into a `List<String[]>`. The note
column of the data row is a quoted field that contains a comma; the parser
correctly strips the surrounding quotes while keeping the embedded comma, so the
value prints as `hello, world`. The value comes from the parser, never hardcoded.

## Run

    jbang CsvQuotedFields.java
