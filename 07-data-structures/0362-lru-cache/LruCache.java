import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache {
    static class Cache extends LinkedHashMap<Integer, Integer> {
        private final int capacity;

        Cache(int capacity) {
            super(16, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }

        int get(int key) {
            return getOrDefault(key, -1);
        }
    }

    public static void main(String[] args) {
        Cache cache = new Cache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        System.out.println(cache.get(1) + " " + cache.get(2));
    }
}
