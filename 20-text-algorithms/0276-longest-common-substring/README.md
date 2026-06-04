# 0276 — Longest Common Substring

Find the longest common contiguous substring of "abcde" and "xbcdy", printing `bcd`. Java tracks the best run length and end index over a 2D int[][] DP table, then slices with substring.

## Run

    javac LongestCommonSubstring.java && java LongestCommonSubstring
