//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

public class PositionalArgument {
  @Parameters(index = "0") String name;

  public static void main(String[] args) {
    PositionalArgument cmd = new PositionalArgument();
    new CommandLine(cmd).parseArgs("alice");
    System.out.println(cmd.name);
  }
}
