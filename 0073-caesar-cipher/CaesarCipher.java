public class CaesarCipher {
    public static void main(String[] args) {
        String text = "abc";
        int shift = 1;
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            char shifted = (char) ((ch - 'a' + shift) % 26 + 'a');
            result.append(shifted);
        }
        System.out.println(result);
    }
}
