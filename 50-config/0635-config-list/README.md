# 0635 — List value

Uses Typesafe Config (`com.typesafe:config`) to parse the fixed `app.json` file, then reads the array key `hosts` with `getStringList` and joins its elements with commas to print `a,b,c`.

## Run

    jbang ConfigList.java
