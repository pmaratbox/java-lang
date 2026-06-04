public class Conversions {
    public static void main(String[] args) {
        int truncated = (int) 3.9;      // truncation toward zero
        float widened = (float) 3;      // 3.0
        System.out.println(truncated + " " + widened);
    }
}
