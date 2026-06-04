class Color {
    final int r, g, b;

    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    static Color fromHex(String hex) {
        String s = hex.startsWith("#") ? hex.substring(1) : hex;
        int r = Integer.parseInt(s.substring(0, 2), 16);
        int g = Integer.parseInt(s.substring(2, 4), 16);
        int b = Integer.parseInt(s.substring(4, 6), 16);
        return new Color(r, g, b);
    }
}

public class StaticFactory {
    public static void main(String[] args) {
        Color c = Color.fromHex("#ff0000");
        System.out.println(c.r + " " + c.g + " " + c.b);
    }
}
