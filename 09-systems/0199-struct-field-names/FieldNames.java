import java.lang.reflect.RecordComponent;

public class FieldNames {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (RecordComponent rc : Point.class.getRecordComponents()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(rc.getName());
        }
        System.out.println(sb);
    }
}
