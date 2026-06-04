public class FeatureFlag {
    static String evaluate(boolean flag) {
        return flag ? "enabled" : "disabled";
    }

    public static void main(String[] args) {
        System.out.println(evaluate(true) + " " + evaluate(false));
    }
}
