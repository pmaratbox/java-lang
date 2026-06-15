//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2

import com.fasterxml.jackson.databind.ObjectMapper;

public class NestedObject {
    record Address(String city, int zip) {}
    record Person(Address address, String name) {}

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person(new Address("oslo", 1000), "alice");
        System.out.println(mapper.writeValueAsString(person));
    }
}
