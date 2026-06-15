//DEPS info.picocli:picocli:4.7.6
import java.util.List;
import picocli.CommandLine;
import picocli.CommandLine.Option;

public class MultipleValues {
  @Option(names = "--num") List<Integer> nums;

  public static void main(String[] a) {
    MultipleValues mv = new MultipleValues();
    new CommandLine(mv).parseArgs("--num", "1", "--num", "2", "--num", "3");
    int sum = mv.nums.stream().mapToInt(Integer::intValue).sum();
    System.out.println(sum);
  }
}
