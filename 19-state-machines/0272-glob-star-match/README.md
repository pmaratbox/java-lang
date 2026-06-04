# 0272 — Glob Star Match

Match the glob "a*b" (* = any run) against "aaab" (yes) and "aac" (no), printing `yes no`. Backtracking on the last `*` handles zero-or-more matching.

## Run

    javac GlobStarMatch.java && java GlobStarMatch
