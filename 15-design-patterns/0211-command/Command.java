static class Counter {
    int value = 0;
}

interface Cmd {
    void execute();
    void undo();
}

static class AddCommand implements Cmd {
    final Counter counter;
    final int amount;
    AddCommand(Counter counter, int amount) {
        this.counter = counter;
        this.amount = amount;
    }
    public void execute() { counter.value += amount; }
    public void undo() { counter.value -= amount; }
}

void main() {
    var counter = new Counter();
    Cmd cmd = new AddCommand(counter, 5);
    cmd.execute();
    var after = counter.value;
    cmd.undo();
    System.out.println(after + " " + counter.value);
}
