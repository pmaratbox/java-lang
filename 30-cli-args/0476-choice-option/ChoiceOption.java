//DEPS info.picocli:picocli:4.7.6
import picocli.CommandLine;
import picocli.CommandLine.Option;

public class ChoiceOption {
  enum Color { red, green, blue }

  @Option(names = "--color") Color color;

  public static void main(String[] a) {
    ChoiceOption p = new ChoiceOption();
    new CommandLine(p).parseArgs("--color", "green");
    System.out.println(p.color);
  }
}
