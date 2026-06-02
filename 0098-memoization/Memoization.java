import java.util.HashMap;
import java.util.Map;

public class Memoization {
    static Map<Integer, Integer> cache = new HashMap<>();

    static int fib(int n) {
        if (n < 2) return n;
        if (cache.containsKey(n)) return cache.get(n);
        int result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
