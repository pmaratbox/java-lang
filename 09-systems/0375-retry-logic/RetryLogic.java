static int attempt = 0;

static boolean operation() {
    attempt++;
    return attempt >= 3;
}

void main() {
    var maxAttempts = 5;
    for (var i = 1; i <= maxAttempts; i++) {
        if (operation()) {
            IO.println("ok after " + i);
            break;
        }
    }
}
