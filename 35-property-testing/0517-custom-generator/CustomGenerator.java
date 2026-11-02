//JAVA 26
//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

import org.quicktheories.core.Gen;

void main() {
  // Build a CUSTOM generator with the map combinator: any int n -> 2*n is even.
  var evens = integers().all().map(n -> n * 2);

  // Property: every generated value is even. QuickTheories feeds ~100 cases;
  // check throws a clean AssertionError on a counterexample.
  qt().forAll(evens).check(n -> n % 2 == 0);
  IO.println("passed");
}
