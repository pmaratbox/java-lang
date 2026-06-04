import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionRuns {
    public static void main(String[] args) {
        int[] xs = {1, 1, 2, 3, 3, 3};
        List<List<Integer>> runs = new ArrayList<>();
        for (int x : xs) {
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
        System.out.println(out);
    }
}
