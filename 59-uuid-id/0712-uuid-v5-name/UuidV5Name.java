//JAVA 26
// Java — UUIDv5 via java-uuid-generator (JUG). Run: jbang UuidV5Name.java
//DEPS com.fasterxml.uuid:java-uuid-generator:5.1.0
import com.fasterxml.uuid.Generators;
import java.util.UUID;

static final UUID DNS = UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8");

void main() {
  var id = Generators.nameBasedGenerator(DNS).generate("test.com");
  IO.println(id);
}
