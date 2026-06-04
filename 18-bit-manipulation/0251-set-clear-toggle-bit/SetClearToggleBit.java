public class SetClearToggleBit {
    public static void main(String[] args) {
        int set = 0 | (1 << 1);
        int clear = 2 & ~(1 << 1);
        int toggle = 0 ^ (1 << 1);
        System.out.println(set + " " + clear + " " + toggle);
    }
}
