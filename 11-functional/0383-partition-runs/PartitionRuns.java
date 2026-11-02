import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

void main() {
    int[] xs = {1, 1, 2, 3, 3, 3};
    List<List<Integer>> runs = new ArrayList<>();
    for (var x : xs) {
        if (runs.isEmpty() || runs.get(runs.size() - 1).get(0) != x) {
            List<Integer> run = new ArrayList<>();
            run.add(x);
            runs.add(run);
        } else {
            runs.get(runs.size() - 1).add(x);
        }
    }
    String out = runs.stream()
            .map(run -> run.stream().map(String::valueOf).collect(Collectors.joining(" ")))
            .collect(Collectors.joining("|"));
    IO.println(out);
}
