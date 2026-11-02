record Person(String name, int age) {}

void main() {
    var p = new Person("Ada", 36);

    IO.println("name: " + p.name());
    IO.println("age: " + p.age());
}
