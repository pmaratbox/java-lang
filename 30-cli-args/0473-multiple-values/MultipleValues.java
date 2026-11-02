//JAVA 26
//DEPS info.picocli:picocli:4.7.6
import java.util.List;
import picocli.CommandLine;
import picocli.CommandLine.Option;

public class MultipleValues {
  @Option(names = "--num") List<Integer> nums;

  void main() {
    var mv = new MultipleValues();
    new CommandLine(mv).parseArgs("--num", "1", "--num", "2", "--num", "3");
    var sum = mv.nums.stream().mapToInt(Integer::intValue).sum();
    IO.println(sum);
  }
}
