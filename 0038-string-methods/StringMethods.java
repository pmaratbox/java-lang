import java.util.Arrays;
import java.util.stream.Collectors;

public class StringMethods {
    public static void main(String[] args) {
        String result = Arrays.stream("a,b,c".split(","))
            .map(String::toUpperCase)
            .collect(Collectors.joining("-"));
        System.out.println(result);
    }
}
