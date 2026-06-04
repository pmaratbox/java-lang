import java.util.Map;

public class ErrorCodes {
    public static void main(String[] args) {
        Map<Integer, String> messages = Map.of(
            0, "ok",
            1, "denied",
            2, "not found"
        );
        System.out.println(messages.get(2));
    }
}
