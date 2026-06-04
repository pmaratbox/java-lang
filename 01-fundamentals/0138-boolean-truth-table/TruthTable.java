public class TruthTable {
    public static void main(String[] args) {
        boolean[][] rows = {{true, true}, {true, false}, {false, true}, {false, false}};
        for (boolean[] r : rows) {
            boolean a = r[0], b = r[1];
            System.out.println(a + " " + b + " " + (a && b) + " " + (a || b) + " " + (a ^ b));
        }
    }
}
