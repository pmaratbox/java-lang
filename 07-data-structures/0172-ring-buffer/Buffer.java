void main() {
    var cap = 3;
    var buf = new int[cap];
    int head = 0, size = 0;

    for (var v : new int[]{1, 2, 3, 4, 5}) {
        var tail = (head + size) % cap;
        buf[tail] = v;
        if (size < cap) size++;
        else head = (head + 1) % cap;
    }

    var sb = new StringBuilder();
    for (var i = 0; i < size; i++) {
        if (i > 0) sb.append(' ');
        sb.append(buf[(head + i) % cap]);
    }
    IO.println(sb);
}
