import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

static class SumTask extends RecursiveTask<Integer> {
    final int lo, hi;
    SumTask(int lo, int hi) { this.lo = lo; this.hi = hi; }
    protected Integer compute() {
        if (hi - lo <= 1) {
            return lo;
        }
        var mid = (lo + hi) / 2;
        var left = new SumTask(lo, mid);
        var right = new SumTask(mid, hi);
        left.fork();
        int rightResult = right.compute();
        int leftResult = left.join();
        return leftResult + rightResult;
    }
}

void main() {
    var pool = new ForkJoinPool();
    int sum = pool.invoke(new SumTask(1, 9));
    System.out.println(sum);
}
