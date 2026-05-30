import java.util.List;

public class Interfaces {
    interface Shape {
        String name();
        int area();
    }

    record Rectangle(int width, int height) implements Shape {
        public String name() { return "rectangle"; }
        public int area() { return width * height; }
    }

    record Square(int side) implements Shape {
        public String name() { return "square"; }
        public int area() { return side * side; }
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Rectangle(3, 4), new Square(5));
        for (Shape s : shapes) {
            System.out.println(s.name() + " area: " + s.area());
        }
    }
}
