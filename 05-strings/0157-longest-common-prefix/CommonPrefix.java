public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = strs[0];
        for (String s : strs) {
            int i = 0;
            int max = Math.min(prefix.length(), s.length());
            while (i < max && prefix.charAt(i) == s.charAt(i)) {
                i++;
            }
            prefix = prefix.substring(0, i);
        }
        System.out.println(prefix);
    }
}
