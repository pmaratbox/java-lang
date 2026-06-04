public class AtoiItoa {
    static int atoi(String s) {
        int i = 0;
        boolean neg = false;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            neg = s.charAt(i) == '-';
            i++;
        }
        int n = 0;
        for (; i < s.length(); i++) {
            n = n * 10 + (s.charAt(i) - '0');
        }
        return neg ? -n : n;
    }

    static String itoa(int n) {
        if (n == 0) return "0";
        boolean neg = n < 0;
        long v = Math.abs((long) n);
        StringBuilder sb = new StringBuilder();
        while (v > 0) {
            sb.append((char) ('0' + (int) (v % 10)));
            v /= 10;
        }
        if (neg) sb.append('-');
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int parsed = atoi("-42");
        String formatted = itoa(parsed);
        System.out.println(parsed + " " + formatted);
    }
}
