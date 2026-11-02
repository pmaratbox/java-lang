interface Greeter {
    default String greet() { return "hi"; }
}

class PlainGreeter implements Greeter {
}

class CasualGreeter implements Greeter {
    public String greet() { return "hey"; }
}

public class InterfaceDefaultMethod {
    void main() {
        Greeter a = new PlainGreeter();
        Greeter b = new CasualGreeter();
        IO.println(a.greet() + " " + b.greet());
    }
}
