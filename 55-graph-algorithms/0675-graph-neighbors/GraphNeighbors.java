//DEPS org.jgrapht:jgrapht-core:1.5.2
import org.jgrapht.*;
import org.jgrapht.graph.*;
import java.util.*;
import java.util.stream.*;

public class GraphNeighbors {
    static void addE(SimpleWeightedGraph<String, DefaultWeightedEdge> g, String u, String v, double w) {
        var e = g.addEdge(u, v);
        g.setEdgeWeight(e, w);
    }

    public static void main(String[] args) {
        SimpleWeightedGraph<String, DefaultWeightedEdge> g =
            new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        for (String v : List.of("a", "b", "c", "d", "e")) g.addVertex(v);
        addE(g, "a", "b", 1);
        addE(g, "a", "c", 4);
        addE(g, "b", "c", 1);
        addE(g, "b", "d", 5);
        addE(g, "c", "d", 1);
        addE(g, "d", "e", 1);

        String neighbors = Graphs.neighborListOf(g, "a").stream()
            .sorted()
            .collect(Collectors.joining(","));
        System.out.println(neighbors);
    }
}
