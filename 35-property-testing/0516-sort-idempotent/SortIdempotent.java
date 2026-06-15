//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIdempotent {
  static List<Integer> sorted(List<Integer> xs) {
    List<Integer> copy = new ArrayList<>(xs);
    Collections.sort(copy);
    return copy;
  }

  public static void main(String[] args) {
    // Property: sorting an already-sorted list equals sorting once.
    // QuickTheories generates ~100 integer lists; check throws AssertionError on failure.
    qt().forAll(lists().of(integers().all()).ofSizeBetween(0, 20))
        .check(xs -> sorted(sorted(xs)).equals(sorted(xs)));
    System.out.println("passed");
  }
}
