//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FieldRename {
    record User(@JsonProperty("full_name") String fullName) {}

    public static void main(String[] args) throws Exception {
        System.out.println(new ObjectMapper().writeValueAsString(new User("alice")));
    }
}
