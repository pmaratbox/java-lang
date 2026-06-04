public class Struct {
    record Address(String city) {}
    record Person(String name, Address address) {}

    public static void main(String[] args) {
        Person person = new Person("Ada", new Address("London"));
        System.out.println(person.address().city());
    }
}
