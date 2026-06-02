public class CountVowels {
    public static void main(String[] args) {
        String word = "hello";
        String vowels = "aeiou";
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (vowels.indexOf(ch) >= 0) count++;
        }
        System.out.println(count);
    }
}
