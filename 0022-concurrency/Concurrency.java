import java.util.concurrent.CompletableFuture;

public class Concurrency {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> a = CompletableFuture.supplyAsync(() -> 1);
        CompletableFuture<Integer> b = CompletableFuture.supplyAsync(() -> 2);
        System.out.println("sum: " + (a.get() + b.get()));
    }
}
