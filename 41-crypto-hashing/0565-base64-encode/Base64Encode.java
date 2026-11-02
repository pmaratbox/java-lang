//JAVA 26
import java.util.Base64;

void main() throws Exception {
    var data = "hello".getBytes("UTF-8");
    var encoded = Base64.getEncoder().encodeToString(data);
    IO.println(encoded);
}
