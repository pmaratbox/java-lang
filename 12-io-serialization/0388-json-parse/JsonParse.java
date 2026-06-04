public class JsonParse {
    public static void main(String[] args) {
        String json = "{\"x\":1,\"y\":2}";
        String body = json.substring(1, json.length() - 1);
        StringBuilder out = new StringBuilder();
        String[] pairs = body.split(",");
        for (int i = 0; i < pairs.length; i++) {
            String[] kv = pairs[i].split(":");
            String key = kv[0].replace("\"", "");
            String value = kv[1];
            if (i > 0) out.append(" ");
            out.append(key).append("=").append(value);
        }
        System.out.println(out.toString());
    }
}
