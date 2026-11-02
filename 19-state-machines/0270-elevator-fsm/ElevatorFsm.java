import java.util.ArrayList;
import java.util.List;

void main() {
    int[] targets = {2, 0};
    var floor = 0;
    List<Integer> visited = new ArrayList<>();
    visited.add(floor);
    for (var target : targets) {
        while (floor != target) {
            floor += (target > floor) ? 1 : -1;
            visited.add(floor);
        }
    }
    var sb = new StringBuilder();
    for (int f : visited) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(f);
    }
    IO.println(sb.toString());
}
