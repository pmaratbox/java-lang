public class JsonArraySum {
    public static void main(String[] args) {
        String json = "[1,2,3]";
        String inner = json.substring(1, json.length() - 1);
        int sum = 0;
        for (String part : inner.split(",")) {
            sum += Integer.parseInt(part.trim());
        }
        System.out.println(sum);
    }
}
