//JAVA 26
//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

static String g(LRUMap<String,Integer> c, String k) {
  var v = c.get(k);
  return v == null ? "miss" : v.toString();
}

void main() {
  // Strict LRU, capacity 3. No gets between puts, so insertion order is the
  // recency order: a is the least-recently-used and is evicted when d arrives.
  LRUMap<String,Integer> cache = new LRUMap<>(3);
  cache.put("a", 1);
  cache.put("b", 2);
  cache.put("c", 3);
  cache.put("d", 4); // evicts a

  IO.println(g(cache, "a") + " " + g(cache, "d"));
}
