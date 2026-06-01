public class DefaultArgs {
    static String greet(String name, String greeting) {
        return greeting + ", " + name;
    }

    static String greet(String name) {
        return greet(name, "Hello");
    }

    public static void main(String[] args) {
        System.out.println(greet("Ada"));
        System.out.println(greet("Ada", "Hi"));
    }
}
