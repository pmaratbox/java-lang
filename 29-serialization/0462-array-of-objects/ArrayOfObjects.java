//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class ArrayOfObjects {
  record Person(int age, String name) {}

  public static void main(String[] args) throws Exception {
    List<Person> people = List.of(new Person(30, "alice"), new Person(25, "bob"));
    System.out.println(new ObjectMapper().writeValueAsString(people));
  }
}
