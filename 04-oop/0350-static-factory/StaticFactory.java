class Color {
    final int r, g, b;

    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    static Color fromHex(String hex) {
        var s = hex.startsWith("#") ? hex.substring(1) : hex;
        var r = Integer.parseInt(s.substring(0, 2), 16);
        var g = Integer.parseInt(s.substring(2, 4), 16);
        var b = Integer.parseInt(s.substring(4, 6), 16);
        return new Color(r, g, b);
    }
}

public class StaticFactory {
    void main() {
        var c = Color.fromHex("#ff0000");
        System.out.println(c.r + " " + c.g + " " + c.b);
    }
}
