void main() {
    var value = System.getenv().getOrDefault("LESSON_ENV_VAR", "default");
    System.out.println("value: " + value);
}
