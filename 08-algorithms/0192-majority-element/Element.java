public class Element {
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 2, 3, 2};
        int candidate = a[0];
        int count = 0;
        for (int x : a) {
            if (count == 0) candidate = x;
            count += (x == candidate) ? 1 : -1;
        }
        System.out.println(candidate);
    }
}
