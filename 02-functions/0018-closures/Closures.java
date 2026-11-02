import java.util.function.IntSupplier;

static IntSupplier counter() {
    int[] count = {0};
    return () -> ++count[0];
}

void main() {
    var next = counter();
    System.out.println("count: " + next.getAsInt());
    System.out.println("count: " + next.getAsInt());
}
