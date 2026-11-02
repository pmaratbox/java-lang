import java.util.HashMap;
import java.util.Map;

static class Glyph {
    final char c;
    Glyph(char c) { this.c = c; }
}

static class GlyphFactory {
    final Map<Character, Glyph> cache = new HashMap<>();
    int created = 0;
    Glyph get(char c) {
        var g = cache.get(c);
        if (g == null) {
            g = new Glyph(c);
            cache.put(c, g);
            created++;
        }
        return g;
    }
}

void main() {
    var factory = new GlyphFactory();
    for (var c : new char[] {'a', 'b', 'a'}) {
        factory.get(c);
    }
    System.out.println(factory.created);
}
