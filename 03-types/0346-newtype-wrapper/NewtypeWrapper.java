public class NewtypeWrapper {
    record UserId(int value) {
        @Override public String toString() { return "user-" + value; }
    }
    record ProductId(int value) {
        @Override public String toString() { return "prod-" + value; }
    }

    public static void main(String[] args) {
        UserId u = new UserId(1);
        ProductId p = new ProductId(2);
        System.out.println(u + " " + p);
    }
}
