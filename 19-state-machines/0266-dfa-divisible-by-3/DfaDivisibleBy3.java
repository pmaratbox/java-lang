public class DfaDivisibleBy3 {
    static boolean divisibleBy3(String bits) {
        int state = 0;
        for (char ch : bits.toCharArray()) {
            int b = ch - '0';
            state = (state * 2 + b) % 3;
        }
        return state == 0;
    }

    public static void main(String[] args) {
        String a = divisibleBy3("110") ? "yes" : "no";
        String b = divisibleBy3("100") ? "yes" : "no";
        System.out.println(a + " " + b);
    }
}
