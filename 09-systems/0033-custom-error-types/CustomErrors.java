static class TooLargeException extends Exception {
    TooLargeException() {
        super("value too large");
    }
}

static void check(int n) throws TooLargeException {
    if (n > 100) {
        throw new TooLargeException();
    }
}

void main() {
    try {
        check(200);
    } catch (TooLargeException e) {
        System.out.println("error: " + e.getMessage());
    }
}
