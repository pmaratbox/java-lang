//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

// QuickTheories generates the inputs and checks the property; check(...) throws
// AssertionError on a counterexample. Here addition is commutative for every
// pair of generated integers, so the check passes silently and we print
// `passed`.
public class IntegerProperty {
  public static void main(String[] args) {
    qt().forAll(integers().all(), integers().all())
        .check((a, b) -> a + b == b + a);
    System.out.println("passed");
  }
}
