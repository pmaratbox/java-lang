//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeObject {
  record Person(int age, String name) {}

  public static void main(String[] args) throws Exception {
    String json = "{\"age\":30,\"name\":\"alice\"}";
    Person p = new ObjectMapper().readValue(json, Person.class);
    System.out.println(p.name() + " " + p.age());
  }
}
