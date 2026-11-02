//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

void main() throws Exception {
  var json = "{\"user\":{\"name\":\"alice\",\"roles\":[\"admin\",\"user\"]}}";
  var root = new ObjectMapper().readTree(json);
  var name = root.get("user").get("name").asText();
  var firstRole = root.get("user").get("roles").get(0).asText();
  System.out.println(name + " " + firstRole);
}
