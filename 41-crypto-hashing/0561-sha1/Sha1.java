//JAVA 26
import java.security.MessageDigest;

void main() throws Exception {
    var digest = MessageDigest.getInstance("SHA-1")
            .digest("hello".getBytes("UTF-8"));
    var hex = new StringBuilder();
    for (var b : digest) hex.append(String.format("%02x", b));
    IO.println(hex);
}
