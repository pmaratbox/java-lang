import java.util.UUID;

public class UuidVersion {
  public static void main(String[] a) {
    UUID u = UUID.fromString("550e8400-e29b-41d4-a716-446655440000");
    System.out.println(u.version());
  }
}
