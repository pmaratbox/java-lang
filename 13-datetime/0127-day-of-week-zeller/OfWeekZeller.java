public class OfWeekZeller {
    public static void main(String[] args) {
        int y = 2000, m = 1, d = 1;
        if (m < 3) { m += 12; y -= 1; }
        int k = y % 100;
        int j = y / 100;
        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        // h: 0=Saturday, 1=Sunday, 2=Monday, ...
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday",
                         "Wednesday", "Thursday", "Friday"};
        System.out.println(days[h]);
    }
}
