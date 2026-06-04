public class ExpandCharRange {
    static String expand(String spec) {
        char start = spec.charAt(0);
        char end = spec.charAt(2);
        StringBuilder sb = new StringBuilder();
        for (char c = start; c <= end; c++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(expand("a-e"));
    }
}
