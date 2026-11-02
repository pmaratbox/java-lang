import java.util.concurrent.CompletableFuture;

void main() throws Exception {
    var a = CompletableFuture.supplyAsync(() -> 1);
    var b = CompletableFuture.supplyAsync(() -> 2);
    System.out.println("sum: " + (a.get() + b.get()));
}
