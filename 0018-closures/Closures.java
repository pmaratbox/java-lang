import java.util.function.IntSupplier;

public class Closures {
    static IntSupplier counter() {
        int[] count = {0};
        return () -> ++count[0];
    }

    public static void main(String[] args) {
        IntSupplier next = counter();
        System.out.println("count: " + next.getAsInt());
        System.out.println("count: " + next.getAsInt());
    }
}
