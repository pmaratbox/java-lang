public class Days {
    static long daysFromCivil(long y, long m, long d) {
        y -= (m <= 2) ? 1 : 0;
        long era = (y >= 0 ? y : y - 399) / 400;
        long yoe = y - era * 400;
        long doy = (153 * (m + (m > 2 ? -3 : 9)) + 2) / 5 + d - 1;
        long doe = yoe * 365 + yoe / 4 - yoe / 100 + doy;
        return era * 146097 + doe - 719468;
    }

    static long[] civilFromDays(long z) {
        z += 719468;
        long era = (z >= 0 ? z : z - 146096) / 146097;
        long doe = z - era * 146097;
        long yoe = (doe - doe / 1460 + doe / 36524 - doe / 146096) / 365;
        long y = yoe + era * 400;
        long doy = doe - (365 * yoe + yoe / 4 - yoe / 100);
        long mp = (5 * doy + 2) / 153;
        long d = doy - (153 * mp + 2) / 5 + 1;
        long m = mp + (mp < 10 ? 3 : -9);
        return new long[]{y + (m <= 2 ? 1 : 0), m, d};
    }

    public static void main(String[] args) {
        long start = daysFromCivil(2000, 1, 1);
        long[] r = civilFromDays(start + 40);
        System.out.printf("%04d-%02d-%02d%n", r[0], r[1], r[2]);
    }
}
