interface Greeter {
    default String greet() { return "hi"; }
}

class PlainGreeter implements Greeter {
}

class CasualGreeter implements Greeter {
    public String greet() { return "hey"; }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Greeter a = new PlainGreeter();
        Greeter b = new CasualGreeter();
        System.out.println(a.greet() + " " + b.greet());
    }
}
