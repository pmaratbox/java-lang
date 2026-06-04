# 0211 — Command (Undo)

Execute an AddCommand that takes a counter from 0 to 5, then undo it back to 0, printing `5 0`. A Cmd interface pairs execute() with undo() so the action is fully reversible.

## Run

    javac Command.java && java Command
