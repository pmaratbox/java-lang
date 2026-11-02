//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

record User(@JsonProperty("full_name") String fullName) {}

void main() throws Exception {
    IO.println(new ObjectMapper().writeValueAsString(new User("alice")));
}
