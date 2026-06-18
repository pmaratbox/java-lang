# 0580 — Sum a numeric column

Uses the real CSV library [OpenCSV](https://opencsv.sourceforge.net/) to parse
the fixed `name,age,city` document. `CSVReader.readAll()` returns the rows as
`String[]`; the `age` column is located from the header, each value is parsed to
an integer with `Integer.parseInt`, and the values are summed
(`30 + 25 + 35`) to print `90` — the total comes from the parsed rows, never
hardcoded.

## Run

    jbang CsvSum.java
