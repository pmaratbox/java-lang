# 0229 — Parse INI

Parse the INI text with section [s] and key k=v, printing the flattened entry `s.k=v`. Java tracks the current section and joins section.key=value.

## Run

    javac IniParse.java && java IniParse
