public class Rotation {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        boolean rotation = a.length() == b.length() && (a + a).contains(b);
        System.out.println(rotation ? "yes" : "no");
    }
}
