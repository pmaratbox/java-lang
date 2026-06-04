public class Substring {
    public static void main(String[] args) {
        String s = "ababab";
        String t = "ab";
        int count = 0;
        int i = 0;
        while ((i = s.indexOf(t, i)) != -1) {
            count++;
            i += t.length();
        }
        System.out.println(count);
    }
}
