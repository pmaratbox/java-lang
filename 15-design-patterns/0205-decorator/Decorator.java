public class Decorator {
    interface Coffee {
        int cost();
    }

    static class BaseCoffee implements Coffee {
        public int cost() { return 2; }
    }

    static abstract class CoffeeDecorator implements Coffee {
        final Coffee inner;
        CoffeeDecorator(Coffee inner) { this.inner = inner; }
    }

    static class Milk extends CoffeeDecorator {
        Milk(Coffee inner) { super(inner); }
        public int cost() { return inner.cost() + 1; }
    }

    static class Sugar extends CoffeeDecorator {
        Sugar(Coffee inner) { super(inner); }
        public int cost() { return inner.cost() + 1; }
    }

    public static void main(String[] args) {
        Coffee c = new Sugar(new Milk(new BaseCoffee()));
        System.out.println(c.cost());
    }
}
