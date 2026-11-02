import java.util.HashMap;
import java.util.Map;

static Map<Integer, Integer> cache = new HashMap<>();

static int fib(int n) {
    if (n < 2) return n;
    if (cache.containsKey(n)) return cache.get(n);
    var result = fib(n - 1) + fib(n - 2);
    cache.put(n, result);
    return result;
}

void main() {
    IO.println(fib(10));
}
