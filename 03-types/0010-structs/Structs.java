public class Structs {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        Person p = new Person("Ada", 36);

        System.out.println("name: " + p.name());
        System.out.println("age: " + p.age());
    }
}
