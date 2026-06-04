public class Memento {
    static class Mem {
        final int state;
        Mem(int state) { this.state = state; }
    }

    static class Originator {
        int state;
        Mem save() { return new Mem(state); }
        void restore(Mem m) { state = m.state; }
    }

    public static void main(String[] args) {
        Originator o = new Originator();
        o.state = 1;
        Mem snapshot = o.save();
        o.state = 2;
        int current = o.state;
        o.restore(snapshot);
        System.out.println(current + " " + o.state);
    }
}
