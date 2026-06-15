//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeObject {
  record Person(int age, String name) {}

  public static void main(String[] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(new Person(30, "alice"));
    System.out.println(json);
  }
}
