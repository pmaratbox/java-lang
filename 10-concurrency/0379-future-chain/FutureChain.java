import java.util.concurrent.CompletableFuture;

void main() throws Exception {
    int result = CompletableFuture
        .supplyAsync(() -> 5)
        .thenApply(v -> v * 2)
        .thenApply(v -> v + 1)
        .get();
    System.out.println(result);
}
