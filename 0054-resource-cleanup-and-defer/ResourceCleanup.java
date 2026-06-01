public class ResourceCleanup {
    static class Resource implements AutoCloseable {
        Resource() {
            System.out.println("open");
        }

        public void close() {
            System.out.println("close");
        }
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("use");
        }
    }
}
