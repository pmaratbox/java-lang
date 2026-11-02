//JAVA 26
//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

public class PositionalArgument {
  @Parameters(index = "0") String name;

  void main() {
    var cmd = new PositionalArgument();
    new CommandLine(cmd).parseArgs("alice");
    System.out.println(cmd.name);
  }
}
