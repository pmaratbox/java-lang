//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

public class Precondition {
    public static void main(String[] args) {
        // Precondition via .assuming: only positive integers reach the property,
        // then assert n + 1 > n over QuickTheories-generated inputs.
        qt().forAll(integers().between(0, 1000000))
            .assuming(n -> n > 0)
            .check(n -> n + 1 > n);
        System.out.println("passed");
    }
}
