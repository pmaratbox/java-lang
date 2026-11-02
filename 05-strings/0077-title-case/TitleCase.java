void main() {
    var text = "hello world";
    var words = text.split(" ");
    var result = new StringBuilder();
    for (var i = 0; i < words.length; i++) {
        if (i > 0) result.append(" ");
        var w = words[i];
        result.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
    }
    IO.println(result);
}
