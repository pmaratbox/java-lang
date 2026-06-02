public class AbstractClasses {
    abstract static class Shape {
        abstract int area();
        String describe() {
            return "area: " + area();
        }
    }

    static class Square extends Shape {
        int side;
        Square(int side) {
            this.side = side;
        }
        int area() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Square(3).describe());
    }
}
