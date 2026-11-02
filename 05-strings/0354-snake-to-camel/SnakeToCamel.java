static String toCamel(String s) {
    var parts = s.split("_");
    var sb = new StringBuilder(parts[0]);
    for (var i = 1; i < parts.length; i++) {
        var p = parts[i];
        if (!p.isEmpty()) {
            sb.append(Character.toUpperCase(p.charAt(0))).append(p.substring(1));
        }
    }
    return sb.toString();
}

void main() {
    System.out.println(toCamel("hello_world"));
}
