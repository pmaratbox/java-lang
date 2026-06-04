# 0200 — Precondition Assert

Check a precondition arg>0: for 5 print `ok`, and for -1 report the failure `error: must be positive`, on two lines. Java validates by throwing `IllegalArgumentException`, which the caller catches to report the message.

## Run

    javac Assert.java && java Assert
