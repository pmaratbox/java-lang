public class PermissionBits {
    static String decode(int bits) {
        StringBuilder sb = new StringBuilder();
        sb.append((bits & 0b100) != 0 ? 'r' : '-');
        sb.append((bits & 0b010) != 0 ? 'w' : '-');
        sb.append((bits & 0b001) != 0 ? 'x' : '-');
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode(0b101));
    }
}
