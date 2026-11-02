//JAVA 26
//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Option;

public class RequiredOption {
  @Option(names = "--id", required = true)
  int id;

  void main() {
    var opts = new RequiredOption();
    new CommandLine(opts).parseArgs("--id", "42");
    System.out.println(opts.id);
  }
}
