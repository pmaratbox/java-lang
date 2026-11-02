static class Resource implements AutoCloseable {
    Resource() {
        IO.println("open");
    }

    public void close() {
        IO.println("close");
    }
}

void main() {
    try (var resource = new Resource()) {
        IO.println("use");
    }
}
