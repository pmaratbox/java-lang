public class JsonStringify {
    public static void main(String[] args) {
        String name = "Ada";
        int age = 36;
        String json = "{\"name\":\"" + name + "\",\"age\":" + age + "}";
        System.out.println(json);
    }
}
