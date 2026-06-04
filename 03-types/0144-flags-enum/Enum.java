public class Enum {
    static final int READ = 1;
    static final int WRITE = 2;

    public static void main(String[] args) {
        int flags = READ | WRITE;
        String hasWrite = (flags & WRITE) != 0 ? "yes" : "no";
        System.out.println(flags + " " + hasWrite);
    }
}
