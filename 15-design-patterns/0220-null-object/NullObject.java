public class NullObject {
    interface Logger {
        void log(String message);
    }

    static class NullLogger implements Logger {
        public void log(String message) { }
    }

    static class RealLogger implements Logger {
        int count = 0;
        public void log(String message) { count++; }
    }

    public static void main(String[] args) {
        Logger nullLogger = new NullLogger();
        RealLogger realLogger = new RealLogger();
        nullLogger.log("ignored");
        realLogger.log("recorded");
        System.out.println(realLogger.count);
    }
}
