// Java — UUIDv5 is stable via java-uuid-generator (JUG). Run: jbang UuidV5Stable.java
//DEPS com.fasterxml.uuid:java-uuid-generator:5.1.0
import com.fasterxml.uuid.Generators;
import java.util.UUID;

public class UuidV5Stable {
  static final UUID DNS = UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8");

  public static void main(String[] args) {
    UUID a = Generators.nameBasedGenerator(DNS).generate("example.com");
    UUID b = Generators.nameBasedGenerator(DNS).generate("example.com");
    System.out.println(a.equals(b));
  }
}
