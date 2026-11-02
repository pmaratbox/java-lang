static class Mem {
    final int state;
    Mem(int state) { this.state = state; }
}

static class Originator {
    int state;
    Mem save() { return new Mem(state); }
    void restore(Mem m) { state = m.state; }
}

void main() {
    var o = new Originator();
    o.state = 1;
    var snapshot = o.save();
    o.state = 2;
    var current = o.state;
    o.restore(snapshot);
    IO.println(current + " " + o.state);
}
