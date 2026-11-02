import java.util.concurrent.CompletableFuture;

void main() throws Exception {
    var a = CompletableFuture.supplyAsync(() -> 10);
    var b = CompletableFuture.supplyAsync(() -> 20);
    var combined = a.thenCombine(b, Integer::sum);
    System.out.println(combined.get());
}
