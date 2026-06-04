import java.util.List;

public class Any {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 4, 6);
        boolean allEven = nums.stream().allMatch(n -> n % 2 == 0);
        boolean anyOdd = nums.stream().anyMatch(n -> n % 2 != 0);
        System.out.println((allEven ? "yes" : "no") + " " + (anyOdd ? "yes" : "no"));
    }
}
