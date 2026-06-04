public class BitmaskSubsets {
    public static void main(String[] args) {
        int mask = 5;
        StringBuilder sb = new StringBuilder();
        int sub = mask;
        while (true) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(sub);
            if (sub == 0) break;
            sub = (sub - 1) & mask;
        }
        System.out.println(sb);
    }
}
