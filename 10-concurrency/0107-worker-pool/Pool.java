import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

void main() throws Exception {
    var pool = Executors.newFixedThreadPool(2);
    List<Future<Integer>> futures = new ArrayList<>();
    for (var i = 1; i <= 4; i++) {
        final var n = i;
        futures.add(pool.submit(() -> n * n));
    }
    List<Integer> results = new ArrayList<>();
    for (Future<Integer> f : futures) {
        results.add(f.get());
    }
    pool.shutdown();

    Collections.sort(results);
    var sj = new StringJoiner(" ");
    for (int r : results) {
        sj.add(Integer.toString(r));
    }
    IO.println(sj);
}
