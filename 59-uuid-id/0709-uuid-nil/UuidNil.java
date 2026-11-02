//JAVA 26
// Java — nil UUID via java.util.UUID (stdlib). Run: jbang UuidNil.java
import java.util.UUID;

void main() {
  var nil = new UUID(0L, 0L);
  System.out.println(nil);
}
