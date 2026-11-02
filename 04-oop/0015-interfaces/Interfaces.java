import java.util.List;

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

void main() {
    List<Shape> shapes = List.of(new Rectangle(3, 4), new Square(5));
    for (Shape s : shapes) {
        IO.println(s.name() + " area: " + s.area());
    }
}
