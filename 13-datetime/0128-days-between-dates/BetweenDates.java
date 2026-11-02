// days-from-civil: serial day number for a y-m-d date
static long daysFromCivil(long y, long m, long d) {
    y -= (m <= 2) ? 1 : 0;
    var era = (y >= 0 ? y : y - 399) / 400;
    var yoe = y - era * 400;
    var doy = (153 * (m + (m > 2 ? -3 : 9)) + 2) / 5 + d - 1;
    var doe = yoe * 365 + yoe / 4 - yoe / 100 + doy;
    return era * 146097 + doe - 719468;
}

void main() {
    var a = daysFromCivil(2000, 1, 1);
    var b = daysFromCivil(2000, 12, 31);
    System.out.println(b - a);
}
