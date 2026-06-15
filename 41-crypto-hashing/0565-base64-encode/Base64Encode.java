import java.util.Base64;

public class Base64Encode {
    public static void main(String[] args) throws Exception {
        byte[] data = "hello".getBytes("UTF-8");
        String encoded = Base64.getEncoder().encodeToString(data);
        System.out.println(encoded);
    }
}
