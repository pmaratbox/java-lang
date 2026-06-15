//DEPS org.quicktheories:quicktheories:0.26
// QuickTheories — qt().forAll(generator).check(predicate) generates many inputs
// and throws an AssertionError (clean stdout) only if the property is falsified.
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

public class StringProperty {
  public static void main(String[] args) {
    // Property: the length of s+s equals 2*len(s) for generated strings s.
    qt().forAll(strings().allPossible().ofLengthBetween(0, 50))
        .check(s -> (s + s).length() == 2 * s.length());
    System.out.println("passed");
  }
}
