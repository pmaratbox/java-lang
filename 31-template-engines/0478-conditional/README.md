# 0478 — Conditional

Render a template based on a condition with the real FreeMarker template engine. This lesson uses FreeMarker's `<#if>`/`<#else>` directive on a `logged_in` boolean: when true it renders `welcome`, otherwise `guest`. The fixed data `{logged_in: true}` is supplied as a `Map` and the template string is parsed via `new Template(...)` and rendered with `t.process(...)`. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang Conditional.java
