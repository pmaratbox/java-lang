public class Inheritance {
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

    public static void main(String[] args) {
        System.out.println("animal: " + new Animal().speak());
        System.out.println("dog: " + new Dog().speak());
    }
}
