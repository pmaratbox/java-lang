//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "boolean-flag")
public class BooleanFlag {
  @Option(names = "--verbose") boolean verbose;

  public static void main(String[] args) {
    BooleanFlag cmd = new BooleanFlag();
    new CommandLine(cmd).parseArgs("--verbose");
    System.out.println(cmd.verbose);
  }
}
