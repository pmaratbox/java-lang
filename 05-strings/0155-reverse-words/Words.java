import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        String s = "hello world";
        List<String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));
    }
}
