public class EnvVars {
    public static void main(String[] args) {
        String value = System.getenv().getOrDefault("LESSON_ENV_VAR", "default");
        System.out.println("value: " + value);
    }
}
