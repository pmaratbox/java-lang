# 0582 — Filter rows

Uses the real CSV library [OpenCSV](https://opencsv.sourceforge.net/) to parse
the fixed `name,age,city` document. The data rows are read with
`new CSVReader(...).readAll()`, kept only when `age > 28` (Alice 30 and Carol 35;
Bob 25 is excluded), and the surviving names are joined with commas to print
`Alice,Carol` — the values come from the parser, never hardcoded.

## Run

    jbang CsvFilter.java
