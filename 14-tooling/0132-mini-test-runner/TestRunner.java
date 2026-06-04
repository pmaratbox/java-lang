import java.util.LinkedHashMap;
import java.util.Map;

public class TestRunner {
    static boolean testAddition() {
        return 2 + 2 == 4;
    }

    static boolean testString() {
        return "hi".toUpperCase().equals("HI");
    }

    static boolean testMax() {
        return Math.max(1, 5) == 5;
    }

    public static void main(String[] args) {
        Map<String, java.util.function.Supplier<Boolean>> tests = new LinkedHashMap<>();
        tests.put("testAddition", TestRunner::testAddition);
        tests.put("testString", TestRunner::testString);
        tests.put("testMax", TestRunner::testMax);

        int passed = 0;
        int failed = 0;
        for (var entry : tests.entrySet()) {
            if (entry.getValue().get()) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println(passed + " passed, " + failed + " failed");
    }
}
