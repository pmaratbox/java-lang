// Java — nil UUID via java.util.UUID (stdlib). Run: jbang UuidNil.java
import java.util.UUID;

public class UuidNil {
  public static void main(String[] a) {
    UUID nil = new UUID(0L, 0L);
    System.out.println(nil);
  }
}
