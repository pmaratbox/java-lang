//JAVA 26
//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

void main() {
  LRUMap<String, Integer> c = new LRUMap<>(3);
  c.put("a", 1);
  IO.println(c.containsKey("a") + " " + c.containsKey("x"));
}
