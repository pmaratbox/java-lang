public class LogLevels {
    enum Level { INFO, WARN, ERROR }

    public static void main(String[] args) {
        Level threshold = Level.WARN;
        log(threshold, Level.INFO, "i");
        log(threshold, Level.WARN, "w");
        log(threshold, Level.ERROR, "e");
    }

    static void log(Level threshold, Level level, String msg) {
        if (level.ordinal() >= threshold.ordinal()) {
            System.out.println(level + ": " + msg);
        }
    }
}
