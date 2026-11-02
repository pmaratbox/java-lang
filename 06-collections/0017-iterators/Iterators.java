import java.util.List;

void main() {
    var nums = List.of(1, 2, 3, 4, 5);

    var sum = nums.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * 2)
            .sum();

    System.out.println("sum: " + sum);
}
