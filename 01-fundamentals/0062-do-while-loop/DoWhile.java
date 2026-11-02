import java.util.StringJoiner;

void main() {
    var out = new StringJoiner(" ");
    var i = 1;
    do {
        out.add(String.valueOf(i));
        i++;
    } while (i <= 3);
    IO.println(out);
}
