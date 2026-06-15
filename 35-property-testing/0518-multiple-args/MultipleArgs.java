//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

// QuickTheories generates inputs and checks the property; check(...) throws
// AssertionError on a counterexample. Here forAll takes TWO generators, so the
// predicate receives two independently generated integers a, b. The property
// always holds, so the check passes silently and we print `passed`.
public class MultipleArgs {
  public static void main(String[] args) {
    qt().forAll(integers().all(), integers().all())
        .check((a, b) -> {
          int m = Math.max(a, b);
          return m >= a && m >= b;
        });
    System.out.println("passed");
  }
}
