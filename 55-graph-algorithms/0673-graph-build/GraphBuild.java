//JAVA 26
//DEPS org.jgrapht:jgrapht-core:1.5.2
import org.jgrapht.graph.*;
import java.util.*;

static void addE(SimpleWeightedGraph<String, DefaultWeightedEdge> g, String u, String v, double w) {
  var e = g.addEdge(u, v);
  g.setEdgeWeight(e, w);
}

void main() {
  // Build the fixed weighted undirected graph G with JGraphT.
  SimpleWeightedGraph<String, DefaultWeightedEdge> g =
      new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
  for (var v : List.of("a", "b", "c", "d", "e")) g.addVertex(v);
  addE(g, "a", "b", 1);
  addE(g, "a", "c", 4);
  addE(g, "b", "c", 1);
  addE(g, "b", "d", 5);
  addE(g, "c", "d", 1);
  addE(g, "d", "e", 1);

  // Node count and edge count, space-joined, from the graph's own sets.
  IO.println(g.vertexSet().size() + " " + g.edgeSet().size());
}
