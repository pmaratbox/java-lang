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
    System.out.println("animal: " + new Animal().speak());
    System.out.println("dog: " + new Dog().speak());
}
