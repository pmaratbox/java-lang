void main() {
    var json = "{\"x\":1,\"y\":2}";
    var body = json.substring(1, json.length() - 1);
    var out = new StringBuilder();
    var pairs = body.split(",");
    for (var i = 0; i < pairs.length; i++) {
        var kv = pairs[i].split(":");
        var key = kv[0].replace("\"", "");
        var value = kv[1];
        if (i > 0) out.append(" ");
        out.append(key).append("=").append(value);
    }
    IO.println(out.toString());
}
