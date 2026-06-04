public class BrainfuckCell {
    public static void main(String[] args) {
        String program = "+++";
        int cell = 0;
        for (char c : program.toCharArray()) {
            if (c == '+') cell++;
            else if (c == '-') cell--;
        }
        System.out.println(cell);
    }
}
