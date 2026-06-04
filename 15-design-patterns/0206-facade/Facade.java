public class Facade {
    static class Sub1 { void init() {} }
    static class Sub2 { void init() {} }
    static class Sub3 { void init() {} }

    static class System1Facade {
        final Sub1 a = new Sub1();
        final Sub2 b = new Sub2();
        final Sub3 c = new Sub3();

        String start() {
            a.init();
            b.init();
            c.init();
            return "ready";
        }
    }

    public static void main(String[] args) {
        System.out.println(new System1Facade().start());
    }
}
