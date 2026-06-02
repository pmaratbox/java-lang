class MathUtil {
    static int square(int n) {
        return n * n;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(6));
    }
}
