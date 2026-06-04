public class Iteration {
    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (Color c : Color.values()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(c.name());
        }
        System.out.println(sb);
    }
}
