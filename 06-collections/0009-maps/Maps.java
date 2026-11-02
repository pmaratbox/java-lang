import java.util.Map;

void main() {
    var nums = Map.of("one", 1, "two", 2, "three", 3);

    IO.println("two: " + nums.get("two"));
    IO.println("size: " + nums.size());
}
