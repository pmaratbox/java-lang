void main() {
    var value = System.getenv().getOrDefault("LESSON_ENV_VAR", "default");
    IO.println("value: " + value);
}
