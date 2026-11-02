//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

record Flag(boolean active, int count, String label) {}

void main() throws Exception {
  var mapper = new ObjectMapper();
  var flag = new Flag(true, 5, "x");
  IO.println(mapper.writeValueAsString(flag));
}
