import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSum {
    static class SumTask extends RecursiveTask<Integer> {
        final int lo, hi;
        SumTask(int lo, int hi) { this.lo = lo; this.hi = hi; }
        protected Integer compute() {
            if (hi - lo <= 1) {
                return lo;
            }
            int mid = (lo + hi) / 2;
            SumTask left = new SumTask(lo, mid);
            SumTask right = new SumTask(mid, hi);
            left.fork();
            int rightResult = right.compute();
            int leftResult = left.join();
            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int sum = pool.invoke(new SumTask(1, 9));
        System.out.println(sum);
    }
}
