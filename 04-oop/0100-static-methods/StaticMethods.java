class MathUtil {
    static int square(int n) {
        return n * n;
    }
}

public class StaticMethods {
    void main() {
        IO.println(MathUtil.square(6));
    }
}
