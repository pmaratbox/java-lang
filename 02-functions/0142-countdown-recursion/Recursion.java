public class Recursion {
    static void countdown(int n, StringBuilder sb) {
        if (n < 1) return;
        if (sb.length() > 0) sb.append(' ');
        sb.append(n);
        countdown(n - 1, sb);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        countdown(5, sb);
        System.out.println(sb.toString());
    }
}
