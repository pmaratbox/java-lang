void main() {
    var word = "hello";
    var vowels = "aeiou";
    var count = 0;
    for (var ch : word.toCharArray()) {
        if (vowels.indexOf(ch) >= 0) count++;
    }
    IO.println(count);
}
