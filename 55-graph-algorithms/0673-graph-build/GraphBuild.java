//DEPS org.jgrapht:jgrapht-core:1.5.2
import org.jgrapht.graph.*;
import java.util.*;

public class GraphBuild {
  static void addE(SimpleWeightedGraph<String, DefaultWeightedEdge> g, String u, String v, double w) {
    DefaultWeightedEdge e = g.addEdge(u, v);
    g.setEdgeWeight(e, w);
  }

  public static void main(String[] args) {
    // Build the fixed weighted undirected graph G with JGraphT.
    SimpleWeightedGraph<String, DefaultWeightedEdge> g =
        new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
    for (String v : List.of("a", "b", "c", "d", "e")) g.addVertex(v);
    addE(g, "a", "b", 1);
    addE(g, "a", "c", 4);
    addE(g, "b", "c", 1);
    addE(g, "b", "d", 5);
    addE(g, "c", "d", 1);
    addE(g, "d", "e", 1);

    // Node count and edge count, space-joined, from the graph's own sets.
    System.out.println(g.vertexSet().size() + " " + g.edgeSet().size());
  }
}
