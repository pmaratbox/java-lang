// Java — JGraphT via jbang. Run: jbang GraphHasEdge.java
//DEPS org.jgrapht:jgrapht-core:1.5.2
import org.jgrapht.graph.*;
import java.util.*;

public class GraphHasEdge {
  static void addE(SimpleWeightedGraph<String,DefaultWeightedEdge> g,String u,String v,double w){ var e=g.addEdge(u,v); g.setEdgeWeight(e,w); }
  public static void main(String[] a){
    SimpleWeightedGraph<String,DefaultWeightedEdge> g = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
    for(String v: List.of("a","b","c","d","e")) g.addVertex(v);
    addE(g,"a","b",1); addE(g,"a","c",4); addE(g,"b","c",1); addE(g,"b","d",5); addE(g,"c","d",1); addE(g,"d","e",1);
    System.out.println(g.containsEdge("b","c")+" "+g.containsEdge("a","e"));
  }
}
