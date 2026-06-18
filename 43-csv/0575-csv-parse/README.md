# 0575 — Parse CSV rows

Uses the real CSV library [OpenCSV](https://opencsv.sourceforge.net/) to parse
the fixed text `name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n`.
`CSVReader.readAll()` returns the rows as a `List<String[]>`; the header row is
skipped and the first column (name) of each data row is joined with commas to
print `Alice,Bob,Carol` — the values come from the parser, never hardcoded.

## Run

    jbang CsvParse.java
