void main() {
    var text = "a b\nc";
    var chars = text.length();
    var lines = (int) text.chars().filter(c -> c == '\n').count() + 1;
    var trimmed = text.trim();
    var words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
    System.out.println(words + " " + lines + " " + chars);
}
