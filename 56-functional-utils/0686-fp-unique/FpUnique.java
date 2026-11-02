//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
  var nums = List.of(1, 2, 2, 3, 3, 3);
  var result = nums.distinct().mkString(",");
  System.out.println(result);
}
