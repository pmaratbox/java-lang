enum Color { RED, GREEN, BLUE }

void main() {
    var sb = new StringBuilder();
    for (var c : Color.values()) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(c.name());
    }
    IO.println(sb);
}
