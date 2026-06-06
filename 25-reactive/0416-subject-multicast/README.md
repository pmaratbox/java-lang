# 0416 — Subject Multicast

Implement a Subject that multicasts each emission to all current observers; two observers both receive 1 then 2. A Subject holds a list of observer Consumers and fans each next(v) out by iterating that list in subscription order.

## Run

    javac SubjectMulticast.java && java SubjectMulticast
