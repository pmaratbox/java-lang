//DEPS org.quicktheories:quicktheories:0.26
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

import java.io.PrintStream;
import java.io.OutputStream;

public class FindsCounterexample {
    public static void main(String[] args) {
        // A densely false property: "every non-negative integer is < 100".
        // QuickTheories generates inputs and finds a counterexample, throwing
        // an AssertionError. Any falsifying-example / shrink report the library
        // writes is suppressed so only "found" reaches stdout.
        PrintStream realOut = System.out;
        PrintStream sink = new PrintStream(new OutputStream() {
            public void write(int b) { /* discard */ }
        });

        boolean found = false;
        System.setOut(sink);
        try {
            qt().forAll(integers().between(0, 1_000_000))
                .check(n -> n < 100);
        } catch (AssertionError e) {
            found = true;
        } finally {
            System.setOut(realOut);
        }

        if (found) {
            System.out.println("found");
        }
    }
}
