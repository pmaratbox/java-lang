//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

public class RoundTrip {
  // Components in alphabetical order so serialized JSON keys are alphabetical and compact.
  record Person(int age, String name) {}

  public static void main(String[] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    Person original = new Person(30, "alice");
    String json = mapper.writeValueAsString(original);
    Person back = mapper.readValue(json, Person.class);
    System.out.println(back.name());
  }
}
