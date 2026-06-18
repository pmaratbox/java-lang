# 0581 — Custom delimiter

Uses the real CSV library [OpenCSV](https://opencsv.sourceforge.net/) to parse
the semicolon-delimited text `a;b;c\n1;2;3\n`. A `CSVReaderBuilder` is configured
with a `CSVParserBuilder().withSeparator(';')` so `;` is treated as the field
delimiter. The parser returns the rows; the second (data) row's fields are joined
with commas to print `1,2,3` — the values come from the parser, never hardcoded.

## Run

    jbang CsvCustomDelimiter.java
