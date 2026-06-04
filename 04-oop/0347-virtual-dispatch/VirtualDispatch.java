import java.util.List;

abstract class Shape {
    abstract String describe();
}

class Circle extends Shape {
    String describe() { return "circle"; }
}

class Square extends Shape {
    String describe() { return "square"; }
}

class Triangle extends Shape {
    String describe() { return "triangle"; }
}

public class VirtualDispatch {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(), new Square(), new Triangle());
        StringBuilder sb = new StringBuilder();
        for (Shape s : shapes) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(s.describe());
        }
        System.out.println(sb);
    }
}
