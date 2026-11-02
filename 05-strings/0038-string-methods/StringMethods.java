import java.util.Arrays;
import java.util.stream.Collectors;

void main() {
    var result = Arrays.stream("a,b,c".split(","))
        .map(String::toUpperCase)
        .collect(Collectors.joining("-"));
    IO.println(result);
}
