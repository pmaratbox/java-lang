static class Resource implements AutoCloseable {
    Resource() {
        System.out.println("open");
    }

    public void close() {
        System.out.println("close");
    }
}

void main() {
    try (var resource = new Resource()) {
        System.out.println("use");
    }
}
