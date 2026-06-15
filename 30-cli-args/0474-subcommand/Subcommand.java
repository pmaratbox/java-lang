//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "app", subcommands = Subcommand.Add.class)
public class Subcommand {

  @Command(name = "add")
  static class Add implements Runnable {
    @Parameters(index = "0") int a;
    @Parameters(index = "1") int b;

    @Override
    public void run() {
      System.out.println(a + b);
    }
  }

  public static void main(String[] args) {
    new CommandLine(new Subcommand()).execute("add", "2", "3");
  }
}
