public class EnumOrdinal {
    enum Direction { N, E, S, W }

    public static void main(String[] args) {
        int ord = Direction.S.ordinal();
        String name = Direction.values()[3].name();
        System.out.println(ord + " " + name);
    }
}
