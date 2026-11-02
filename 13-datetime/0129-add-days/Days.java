static long daysFromCivil(long y, long m, long d) {
    y -= (m <= 2) ? 1 : 0;
    var era = (y >= 0 ? y : y - 399) / 400;
    var yoe = y - era * 400;
    var doy = (153 * (m + (m > 2 ? -3 : 9)) + 2) / 5 + d - 1;
    var doe = yoe * 365 + yoe / 4 - yoe / 100 + doy;
    return era * 146097 + doe - 719468;
}

static long[] civilFromDays(long z) {
    z += 719468;
    var era = (z >= 0 ? z : z - 146096) / 146097;
    var doe = z - era * 146097;
    var yoe = (doe - doe / 1460 + doe / 36524 - doe / 146096) / 365;
    var y = yoe + era * 400;
    var doy = doe - (365 * yoe + yoe / 4 - yoe / 100);
    var mp = (5 * doy + 2) / 153;
    var d = doy - (153 * mp + 2) / 5 + 1;
    var m = mp + (mp < 10 ? 3 : -9);
    return new long[]{y + (m <= 2 ? 1 : 0), m, d};
}

void main() {
    var start = daysFromCivil(2000, 1, 1);
    var r = civilFromDays(start + 40);
    System.out.printf("%04d-%02d-%02d%n", r[0], r[1], r[2]);
}
