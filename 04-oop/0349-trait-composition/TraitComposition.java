interface A {
    default String a() { return "a"; }
}

interface B {
    default String b() { return "b"; }
}

class Composed implements A, B {
}

public class TraitComposition {
    void main() {
        var c = new Composed();
        IO.println(c.a() + " " + c.b());
    }
}
