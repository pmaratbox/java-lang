public class EnumAssociated {
    sealed interface Shape permits Rect, Square {}
    record Rect(int w, int h) implements Shape {}
    record Square(int s) implements Shape {}

    static int area(Shape shape) {
        return switch (shape) {
            case Rect(int w, int h) -> w * h;
            case Square(int s) -> s * s;
        };
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Rect(2, 3), new Square(4)};
        for (Shape shape : shapes) {
            System.out.println(area(shape));
        }
    }
}
