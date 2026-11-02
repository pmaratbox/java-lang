//JAVA 26
//DEPS com.fasterxml.jackson.core:jackson-databind:2.18.2

import com.fasterxml.jackson.databind.ObjectMapper;

record Address(String city, int zip) {}
record Person(Address address, String name) {}

void main() throws Exception {
    var mapper = new ObjectMapper();
    var person = new Person(new Address("oslo", 1000), "alice");
    IO.println(mapper.writeValueAsString(person));
}
