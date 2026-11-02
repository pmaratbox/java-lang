//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
  System.out.println(List.rangeClosed(1, 10).take(3).mkString(","));
}
