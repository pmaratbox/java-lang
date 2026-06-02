public class Variadic {
    static int total(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum: " + total(1, 2, 3));
    }
}
