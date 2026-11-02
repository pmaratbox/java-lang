//JAVA 26
// Java — JGraphT via jbang. Run: jbang GraphTopologicalSort.java
//DEPS org.jgrapht:jgrapht-core:1.5.2
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;
import java.util.*;

void main() {
  DirectedAcyclicGraph<String,DefaultEdge> dag = new DirectedAcyclicGraph<>(DefaultEdge.class);
  for (var v : List.of("a", "b", "c", "d", "e")) dag.addVertex(v);
  dag.addEdge("a", "b");
  dag.addEdge("b", "c");
  dag.addEdge("a", "c");
  dag.addEdge("c", "d");
  dag.addEdge("d", "e");

  List<String> order = new ArrayList<>();
  new TopologicalOrderIterator<>(dag).forEachRemaining(order::add);
  IO.println(String.join(",", order));
}
