record Address(String city) {}
record Person(String name, Address address) {}

void main() {
    var person = new Person("Ada", new Address("London"));
    IO.println(person.address().city());
}
