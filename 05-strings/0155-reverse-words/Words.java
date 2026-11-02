import java.util.Arrays;
import java.util.Collections;
import java.util.List;

void main() {
    var s = "hello world";
    var words = Arrays.asList(s.split(" "));
    Collections.reverse(words);
    System.out.println(String.join(" ", words));
}
