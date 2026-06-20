// Java — java-diff-utils via jbang. Run: jbang DiffAddedLines.java
//DEPS io.github.java-diff-utils:java-diff-utils:4.12
import com.github.difflib.DiffUtils;
import com.github.difflib.patch.*;
import java.util.*;

public class DiffAddedLines {
  public static void main(String[] args) throws Exception {
    List<String> a = List.of("apple", "banana", "cherry");
    List<String> b = List.of("apple", "blueberry", "cherry", "date");

    Patch<String> patch = DiffUtils.diff(a, b);

    // Collect added lines (INSERT targets + CHANGE targets) in document (B) order.
    List<String> added = new ArrayList<>();
    for (AbstractDelta<String> d : patch.getDeltas()) {
      if (d.getType() == DeltaType.INSERT || d.getType() == DeltaType.CHANGE) {
        added.addAll(d.getTarget().getLines());
      }
    }

    System.out.println(String.join(",", added));
  }
}
