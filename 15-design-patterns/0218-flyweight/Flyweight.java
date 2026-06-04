import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    static class Glyph {
        final char c;
        Glyph(char c) { this.c = c; }
    }

    static class GlyphFactory {
        final Map<Character, Glyph> cache = new HashMap<>();
        int created = 0;
        Glyph get(char c) {
            Glyph g = cache.get(c);
            if (g == null) {
                g = new Glyph(c);
                cache.put(c, g);
                created++;
            }
            return g;
        }
    }

    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
        for (char c : new char[] {'a', 'b', 'a'}) {
            factory.get(c);
        }
        System.out.println(factory.created);
    }
}
