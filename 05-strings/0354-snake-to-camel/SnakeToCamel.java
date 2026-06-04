public class SnakeToCamel {
    static String toCamel(String s) {
        String[] parts = s.split("_");
        StringBuilder sb = new StringBuilder(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            String p = parts[i];
            if (!p.isEmpty()) {
                sb.append(Character.toUpperCase(p.charAt(0))).append(p.substring(1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamel("hello_world"));
    }
}
