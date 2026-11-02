//JAVA 26
// Java — java-diff-utils via jbang. Run: jbang DiffSummary.java
//DEPS io.github.java-diff-utils:java-diff-utils:4.12
import com.github.difflib.DiffUtils;
import com.github.difflib.patch.*;
import java.util.*;

void main() throws Exception {
  var a = List.of("apple", "banana", "cherry");
  var b = List.of("apple", "blueberry", "cherry", "date");
  var patch = DiffUtils.diff(a, b);
  List<String> added = new ArrayList<>();
  List<String> removed = new ArrayList<>();
  for (var d : patch.getDeltas()) {
    if (d.getType() == DeltaType.INSERT || d.getType() == DeltaType.CHANGE) {
      added.addAll(d.getTarget().getLines());
    }
    if (d.getType() == DeltaType.DELETE || d.getType() == DeltaType.CHANGE) {
      removed.addAll(d.getSource().getLines());
    }
  }
  var unchanged = a.size() - removed.size();
  IO.println(added.size() + " " + removed.size() + " " + unchanged);
}
