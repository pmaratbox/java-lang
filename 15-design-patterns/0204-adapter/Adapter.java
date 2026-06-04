public class Adapter {
    static class CelsiusSource {
        final int celsius;
        CelsiusSource(int celsius) { this.celsius = celsius; }
        int celsius() { return celsius; }
    }

    interface Fahrenheit {
        int fahrenheit();
    }

    static class CelsiusToFahrenheit implements Fahrenheit {
        final CelsiusSource source;
        CelsiusToFahrenheit(CelsiusSource source) { this.source = source; }
        public int fahrenheit() { return source.celsius() * 9 / 5 + 32; }
    }

    public static void main(String[] args) {
        Fahrenheit f = new CelsiusToFahrenheit(new CelsiusSource(100));
        System.out.println(f.fahrenheit());
    }
}
