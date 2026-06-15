//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// QuickTheories generates inputs and checks the property; check(...) throws
// AssertionError on a counterexample. Here the property always holds, so the
// check passes silently and we print `passed`.
public class FirstProperty {
  public static void main(String[] args) {
    qt().forAll(lists().of(integers().all()).ofSizeBetween(0, 20))
        .check(xs -> {
          List<Integer> twice = new ArrayList<>(xs);
          Collections.reverse(twice);
          Collections.reverse(twice);
          return twice.equals(xs);
        });
    System.out.println("passed");
  }
}
