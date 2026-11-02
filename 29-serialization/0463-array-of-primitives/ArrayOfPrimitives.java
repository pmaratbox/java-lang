//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

void main() throws Exception {
  var numbers = List.of(1, 2, 3);
  IO.println(new ObjectMapper().writeValueAsString(numbers));
}
