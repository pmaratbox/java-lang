import java.util.StringJoiner;

void main() {
    int[] xs = {1, 2, 3, 4};
    var sj = new StringJoiner(" ");
    var acc = 1;
    for (var x : xs) {
        acc *= x;
        sj.add(String.valueOf(acc));
    }
    System.out.println(sj.toString());
}
