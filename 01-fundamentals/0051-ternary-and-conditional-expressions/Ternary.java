public class Ternary {
    public static void main(String[] args) {
        for (int n : new int[]{4, 7}) {
            String label = n % 2 == 0 ? "even" : "odd";
            System.out.println(n + ": " + label);
        }
    }
}
