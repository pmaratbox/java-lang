record Person(String name, int age) {}

void main() {
    var p = new Person("Ada", 36);

    System.out.println("name: " + p.name());
    System.out.println("age: " + p.age());
}
