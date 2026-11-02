void main() {
    outer:
    for (var i = 1; i <= 3; i++) {
        for (var j = 1; j <= 3; j++) {
            if (j > i) continue outer;
            if (i * j == 4) {
                IO.println("stop at " + i + "," + j);
                break outer;
            }
            IO.println(i + "," + j);
        }
    }
}
