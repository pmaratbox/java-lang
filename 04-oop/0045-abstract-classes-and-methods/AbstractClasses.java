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

void main() {
    System.out.println(new Square(3).describe());
}
