sealed interface Result permits Ok, Err {}
record Ok(int value) implements Result {}
record Err(String msg) implements Result {}

static Result safeDiv(int a, int b) {
    if (b == 0) return new Err("divide by zero");
    return new Ok(a / b);
}

static String show(Result r) {
    return switch (r) {
        case Ok ok -> "ok: " + ok.value();
        case Err err -> "err: " + err.msg();
    };
}

void main() {
    IO.println(show(safeDiv(10, 2)));
    IO.println(show(safeDiv(1, 0)));
}
