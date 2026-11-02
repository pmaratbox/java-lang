//JAVA 26
import java.security.MessageDigest;

void main() throws Exception {
    var md = MessageDigest.getInstance("SHA-256");
    md.update("foo".getBytes("UTF-8"));
    md.update("bar".getBytes("UTF-8"));
    var digest = md.digest();
    var sb = new StringBuilder();
    for (var b : digest) sb.append(String.format("%02x", b));
    System.out.println(sb);
}
