# 0576 — CSV header row

Uses Java's real CSV library (*OpenCSV*, `com.opencsv.CSVReader`) to parse the
fixed CSV `name,age,city\nAlice,30,Paris\n...` into a `List<String[]>`. The first
row returned by the parser is the header; its fields are joined with a pipe and
printed as `name|age|city`. The values come from the parser, never hardcoded.

## Run

    jbang CsvHeaders.java
