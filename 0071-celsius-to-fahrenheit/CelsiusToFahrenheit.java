public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        int[] temps = {100, 0};
        for (int c : temps) {
            int f = c * 9 / 5 + 32;
            System.out.println(c + "C = " + f + "F");
        }
    }
}
