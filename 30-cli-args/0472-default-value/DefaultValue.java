//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Option;

public class DefaultValue {
  @Option(names = "--count", defaultValue = "1") int count;

  public static void main(String[] args) {
    DefaultValue obj = new DefaultValue();
    // Parse a hardcoded EMPTY argv so output is deterministic.
    new CommandLine(obj).parseArgs();
    System.out.println(obj.count);
  }
}
