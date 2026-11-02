static abstract class Algorithm {
    abstract String step();
    String run() {
        return "start " + step() + " end";
    }
}

static class WorkAlgorithm extends Algorithm {
    String step() { return "work"; }
}

void main() {
    Algorithm a = new WorkAlgorithm();
    IO.println(a.run());
}
