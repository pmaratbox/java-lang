//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.HashSet;
import io.vavr.collection.Set;

void main() {
    Set<Integer> original = HashSet.of(1, 2, 3);
    Set<Integer> updated = original.add(4);
    System.out.println(updated.size());
    System.out.println(original.size());
}
