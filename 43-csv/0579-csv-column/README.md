# 0579 — Extract a column

Uses the real CSV library [OpenCSV](https://opencsv.sourceforge.net/) to parse
the fixed text `name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n`.
`CSVReader.readAll()` returns the rows as a `List<String[]>`; the `age` column
index is located from the header row, then that field is pulled from each data
row and joined with commas to print `30,25,35` — the values come from the
parser, never hardcoded.

## Run

    jbang CsvColumn.java
