void main() {
    var text = "abc";
    var shift = 1;
    var result = new StringBuilder();
    for (var ch : text.toCharArray()) {
        var shifted = (char) ((ch - 'a' + shift) % 26 + 'a');
        result.append(shifted);
    }
    System.out.println(result);
}
