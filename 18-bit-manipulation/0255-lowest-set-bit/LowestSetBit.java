public class LowestSetBit {
    public static void main(String[] args) {
        int x = 12;
        int low = x & (-x);
        System.out.println(low);
    }
}
