import java.util.List;

public class Area {
    interface Shape {
        double area();
    }

    static class Rectangle implements Shape {
        final double width;
        final double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    static class Triangle implements Shape {
        final double base;
        final double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return base * height / 2;
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Rectangle(2, 3), new Triangle(4, 4));
        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }
        System.out.println("total area: " + (int) total);
    }
}
