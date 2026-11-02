import java.lang.reflect.RecordComponent;

record Point(int x, int y) {}

void main() {
    var sb = new StringBuilder();
    for (var rc : Point.class.getRecordComponents()) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(rc.getName());
    }
    System.out.println(sb);
}
