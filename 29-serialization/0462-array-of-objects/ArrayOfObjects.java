//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

record Person(int age, String name) {}

void main() throws Exception {
  var people = List.of(new Person(30, "alice"), new Person(25, "bob"));
  IO.println(new ObjectMapper().writeValueAsString(people));
}
