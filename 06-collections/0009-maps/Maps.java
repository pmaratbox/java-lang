import java.util.Map;

void main() {
    var nums = Map.of("one", 1, "two", 2, "three", 3);

    System.out.println("two: " + nums.get("two"));
    System.out.println("size: " + nums.size());
}
