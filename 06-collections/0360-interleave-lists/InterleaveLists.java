import java.util.List;
import java.util.StringJoiner;

void main() {
    var a = List.of(1, 3, 5);
    var b = List.of(2, 4, 6);
    var sj = new StringJoiner(" ");
    for (var i = 0; i < a.size(); i++) {
        sj.add(a.get(i).toString());
        sj.add(b.get(i).toString());
    }
    IO.println(sj);
}
