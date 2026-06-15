//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseNestedAccess {
  public static void main(String[] args) throws Exception {
    String json = "{\"user\":{\"name\":\"alice\",\"roles\":[\"admin\",\"user\"]}}";
    JsonNode root = new ObjectMapper().readTree(json);
    String name = root.get("user").get("name").asText();
    String firstRole = root.get("user").get("roles").get(0).asText();
    System.out.println(name + " " + firstRole);
  }
}
