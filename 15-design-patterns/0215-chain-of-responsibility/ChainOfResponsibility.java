public class ChainOfResponsibility {
    static class Handler {
        final int level;
        Handler next;
        Handler(int level) { this.level = level; }
        Handler setNext(Handler next) { this.next = next; return next; }
        void handle(int request) {
            if (request == level) {
                System.out.println("handled by " + level);
            } else if (next != null) {
                next.handle(request);
            }
        }
    }

    public static void main(String[] args) {
        Handler h1 = new Handler(1);
        Handler h2 = new Handler(2);
        Handler h3 = new Handler(3);
        h1.setNext(h2).setNext(h3);
        h1.handle(2);
    }
}
