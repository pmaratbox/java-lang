public class TitleCase {
    public static void main(String[] args) {
        String text = "hello world";
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) result.append(" ");
            String w = words[i];
            result.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
        }
        System.out.println(result);
    }
}
