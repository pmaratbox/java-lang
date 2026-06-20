// Java — java-diff-utils via jbang. Run: jbang DiffAllAdded.java
//DEPS io.github.java-diff-utils:java-diff-utils:4.12
import com.github.difflib.DiffUtils;
import com.github.difflib.patch.*;
import java.util.*;

public class DiffAllAdded {
  public static void main(String[] z) throws Exception {
    List<String> a = List.of();
    List<String> b = List.of("x", "y");
    Patch<String> patch = DiffUtils.diff(a, b);
    List<String> added = new ArrayList<>();
    for (AbstractDelta<String> d : patch.getDeltas()) {
      if (d.getType() == DeltaType.INSERT || d.getType() == DeltaType.CHANGE) {
        added.addAll(d.getTarget().getLines());
      }
    }
    System.out.println(added.size());
  }
}