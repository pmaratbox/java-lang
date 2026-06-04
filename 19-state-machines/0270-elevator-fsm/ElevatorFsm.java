import java.util.ArrayList;
import java.util.List;

public class ElevatorFsm {
    public static void main(String[] args) {
        int[] targets = {2, 0};
        int floor = 0;
        List<Integer> visited = new ArrayList<>();
        visited.add(floor);
        for (int target : targets) {
            while (floor != target) {
                floor += (target > floor) ? 1 : -1;
                visited.add(floor);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int f : visited) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(f);
        }
        System.out.println(sb.toString());
    }
}
