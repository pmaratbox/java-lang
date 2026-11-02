//JAVA 26
import java.util.UUID;

void main() {
  var u = UUID.fromString("550e8400-e29b-41d4-a716-446655440000");
  System.out.println(u.version());
}
