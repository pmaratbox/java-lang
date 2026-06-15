//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "option-with-value")
public class OptionWithValue {
  @Option(names = "--name") String name;

  public static void main(String[] args) {
    OptionWithValue cli = new OptionWithValue();
    new CommandLine(cli).parseArgs("--name", "alice");
    System.out.println(cli.name);
  }
}
