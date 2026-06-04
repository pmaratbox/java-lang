public class Bridge {
    interface Color {
        String name();
    }

    static class Red implements Color {
        public String name() { return "red"; }
    }

    static abstract class Shape {
        final Color color;
        Shape(Color color) { this.color = color; }
        abstract String describe();
    }

    static class Circle extends Shape {
        Circle(Color color) { super(color); }
        String describe() { return color.name() + " circle"; }
    }

    public static void main(String[] args) {
        Shape shape = new Circle(new Red());
        System.out.println(shape.describe());
    }
}
