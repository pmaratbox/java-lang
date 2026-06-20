import java.util.UUID;

public class UuidRoundtrip {
  public static void main(String[] args) {
    UUID id = UUID.fromString("550E8400-E29B-41D4-A716-446655440000");
    System.out.println(id.toString());
  }
}
