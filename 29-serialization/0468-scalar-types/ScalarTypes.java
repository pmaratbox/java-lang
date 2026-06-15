//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;

public class ScalarTypes {
  record Flag(boolean active, int count, String label) {}

  public static void main(String[] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    Flag flag = new Flag(true, 5, "x");
    System.out.println(mapper.writeValueAsString(flag));
  }
}
