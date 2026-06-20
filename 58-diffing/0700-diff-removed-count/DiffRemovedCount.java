// Java — java-diff-utils via jbang. Run: jbang DiffRemovedCount.java
//DEPS io.github.java-diff-utils:java-diff-utils:4.12
import com.github.difflib.DiffUtils;
import com.github.difflib.patch.*;
import java.util.*;

public class DiffRemovedCount {
  public static void main(String[] z) throws Exception {
    List<String> a = List.of("apple", "banana", "cherry");
    List<String> b = List.of("apple", "blueberry", "cherry", "date");
    Patch<String> patch = DiffUtils.diff(a, b);
    List<String> removed = new ArrayList<>();
    for (AbstractDelta<String> d : patch.getDeltas()) {
      if (d.getType() == DeltaType.DELETE || d.getType() == DeltaType.CHANGE) {
        removed.addAll(d.getSource().getLines());
      }
    }
    System.out.println(removed.size());
  }
}
