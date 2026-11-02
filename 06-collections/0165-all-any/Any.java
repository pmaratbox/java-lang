import java.util.List;

void main() {
    var nums = List.of(2, 4, 6);
    var allEven = nums.stream().allMatch(n -> n % 2 == 0);
    var anyOdd = nums.stream().anyMatch(n -> n % 2 != 0);
    System.out.println((allEven ? "yes" : "no") + " " + (anyOdd ? "yes" : "no"));
}
