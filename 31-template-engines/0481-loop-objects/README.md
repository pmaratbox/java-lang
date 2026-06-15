# 0481 — Loop over objects

Iterate a list of objects with FreeMarker. This lesson uses FreeMarker's `<#list users as u>` directive to walk a fixed list of user maps, rendering `${u.name}: ${u.age}` for each one. The `<#sep>\n</#sep>` block inserts a newline only between items (not after the last), so the two users render on their own lines without a trailing blank line. Uses the real `org.freemarker:freemarker` engine to parse and render the template string.

## Run

    jbang LoopObjects.java
