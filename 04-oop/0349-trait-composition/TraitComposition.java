interface A {
    default String a() { return "a"; }
}

interface B {
    default String b() { return "b"; }
}

class Composed implements A, B {
}

public class TraitComposition {
    public static void main(String[] args) {
        Composed c = new Composed();
        System.out.println(c.a() + " " + c.b());
    }
}
