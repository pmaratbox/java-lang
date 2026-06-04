import java.util.ArrayList;
import java.util.List;

public class Observer {
    interface Watcher {
        void update(int value);
    }

    static class Subject {
        final List<Watcher> watchers = new ArrayList<>();
        void register(Watcher w) { watchers.add(w); }
        void notifyAll(int value) {
            for (Watcher w : watchers) w.update(value);
        }
    }

    static class NamedWatcher implements Watcher {
        final String id;
        NamedWatcher(String id) { this.id = id; }
        public void update(int value) {
            System.out.println(id + ": " + value);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.register(new NamedWatcher("obs1"));
        subject.register(new NamedWatcher("obs2"));
        subject.notifyAll(5);
    }
}
