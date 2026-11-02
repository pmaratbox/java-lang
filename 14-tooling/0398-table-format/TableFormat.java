void main() {
    String[][] rows = {{"a", "1"}, {"bb", "22"}};
    var width = 0;
    for (var row : rows) {
        width = Math.max(width, row[0].length());
    }
    for (var row : rows) {
        var first = String.format("%-" + width + "s", row[0]);
        System.out.println(first + " | " + row[1]);
    }
}
