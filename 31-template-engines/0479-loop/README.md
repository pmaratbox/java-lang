# 0479 — Loop

Render a fixed template over a fixed list `nums=[1,2,3]` using the real Apache FreeMarker engine. The template uses FreeMarker's `<#list>` directive to iterate the list and the built-in `<#sep>` block to emit a newline only *between* items, so each number lands on its own line without a trailing separator. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang Loop.java
