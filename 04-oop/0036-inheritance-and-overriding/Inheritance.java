static class Animal {
    String speak() {
        return "some sound";
    }
}

static class Dog extends Animal {
    @Override
    String speak() {
        return "Woof";
    }
}

void main() {
    IO.println("animal: " + new Animal().speak());
    IO.println("dog: " + new Dog().speak());
}
