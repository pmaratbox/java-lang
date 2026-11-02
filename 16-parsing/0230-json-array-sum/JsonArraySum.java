void main() {
    var json = "[1,2,3]";
    var inner = json.substring(1, json.length() - 1);
    var sum = 0;
    for (var part : inner.split(",")) {
        sum += Integer.parseInt(part.trim());
    }
    System.out.println(sum);
}
