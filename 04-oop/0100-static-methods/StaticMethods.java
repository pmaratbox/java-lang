class MathUtil {
    static int square(int n) {
        return n * n;
    }
}

public class StaticMethods {
    void main() {
        System.out.println(MathUtil.square(6));
    }
}
