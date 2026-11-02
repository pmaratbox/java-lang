import java.util.StringJoiner;

void main() {
    int a = 0, b = 1;
    var out = new StringJoiner(" ");
    for (var i = 0; i < 7; i++) {
        out.add(String.valueOf(a));
        var t = a + b;
        a = b;
        b = t;
    }
    System.out.println(out);
}
