enum Direction { N, E, S, W }

void main() {
    var ord = Direction.S.ordinal();
    var name = Direction.values()[3].name();
    IO.println(ord + " " + name);
}
