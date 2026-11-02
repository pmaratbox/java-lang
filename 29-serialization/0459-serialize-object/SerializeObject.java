//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

record Person(int age, String name) {}

void main() throws Exception {
  var mapper = new ObjectMapper();
  var json = mapper.writeValueAsString(new Person(30, "alice"));
  System.out.println(json);
}
