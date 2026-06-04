public class TableFormat {
    public static void main(String[] args) {
        String[][] rows = {{"a", "1"}, {"bb", "22"}};
        int width = 0;
        for (String[] row : rows) {
            width = Math.max(width, row[0].length());
        }
        for (String[] row : rows) {
            String first = String.format("%-" + width + "s", row[0]);
            System.out.println(first + " | " + row[1]);
        }
    }
}
