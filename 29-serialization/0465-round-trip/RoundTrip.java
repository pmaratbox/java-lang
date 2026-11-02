//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

// Components in alphabetical order so serialized JSON keys are alphabetical and compact.
record Person(int age, String name) {}

void main() throws Exception {
  var mapper = new ObjectMapper();
  var original = new Person(30, "alice");
  var json = mapper.writeValueAsString(original);
  var back = mapper.readValue(json, Person.class);
  IO.println(back.name());
}
