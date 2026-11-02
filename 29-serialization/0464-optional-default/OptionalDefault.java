//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

record Person(int age, String name) {}

void main() throws Exception {
  var json = "{\"name\":\"alice\"}";
  var p = new ObjectMapper().readValue(json, Person.class);
  System.out.println(p.name() + " " + p.age());
}
