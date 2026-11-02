//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
  // Vavr's List.zip pairs elements positionally into a List<Tuple2>.
  var result = List.of(1, 2, 3)
      .zip(List.of("a", "b", "c"))
      .map(t -> t._1 + "" + t._2)
      .mkString(",");
  IO.println(result);
}
