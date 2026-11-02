import java.util.List;
import java.util.StringJoiner;

void main() {
    var nums = List.of(1, 2, 3, 4);
    var sj = new StringJoiner(" ");
    for (var i = 0; i + 1 < nums.size(); i++) {
        sj.add(nums.get(i) + "," + nums.get(i + 1));
    }
    System.out.println(sj);
}
