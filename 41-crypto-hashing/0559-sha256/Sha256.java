//JAVA 26
import java.security.MessageDigest;

void main() throws Exception {
    var digest = MessageDigest.getInstance("SHA-256")
            .digest("hello".getBytes("UTF-8"));
    var sb = new StringBuilder();
    for (var b : digest) {
        sb.append(String.format("%02x", b));
    }
    System.out.println(sb);
}
