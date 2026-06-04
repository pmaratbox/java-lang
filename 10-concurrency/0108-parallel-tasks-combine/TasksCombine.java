import java.util.concurrent.CompletableFuture;

public class TasksCombine {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> a = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> b = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> combined = a.thenCombine(b, Integer::sum);
        System.out.println(combined.get());
    }
}
