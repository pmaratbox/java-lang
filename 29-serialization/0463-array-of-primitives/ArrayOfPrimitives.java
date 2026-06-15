//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class ArrayOfPrimitives {
  public static void main(String[] a) throws Exception {
    List<Integer> numbers = List.of(1, 2, 3);
    System.out.println(new ObjectMapper().writeValueAsString(numbers));
  }
}
