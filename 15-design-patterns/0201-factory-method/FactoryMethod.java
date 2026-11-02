interface Shape {
    String kind();
}

static class Circle implements Shape {
    public String kind() { return "circle"; }
}

static class Square implements Shape {
    public String kind() { return "square"; }
}

static Shape create(String name) {
    switch (name) {
        case "circle": return new Circle();
        case "square": return new Square();
        default: throw new IllegalArgumentException(name);
    }
}

void main() {
    var a = create("circle");
    var b = create("square");
    IO.println(a.kind() + " " + b.kind());
}
