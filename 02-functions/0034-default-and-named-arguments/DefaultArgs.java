static String greet(String name, String greeting) {
    return greeting + ", " + name;
}

static String greet(String name) {
    return greet(name, "Hello");
}

void main() {
    IO.println(greet("Ada"));
    IO.println(greet("Ada", "Hi"));
}
