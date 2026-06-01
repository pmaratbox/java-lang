public class References {
    static void inc(int[] box) {
        box[0]++;
    }

    public static void main(String[] args) {
        int[] box = {1};
        System.out.println("before: " + box[0]);
        inc(box);
        System.out.println("after: " + box[0]);
    }
}
