import java.util.Map;

void main() {
    var messages = Map.of(
        0, "ok",
        1, "denied",
        2, "not found"
    );
    System.out.println(messages.get(2));
}
