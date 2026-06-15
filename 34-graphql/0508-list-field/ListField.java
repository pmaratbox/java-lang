//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.List;
import java.util.Map;

public class ListField {
  public static void main(String[] a) {
    String sdl = "type Query { numbers: [Int] }";
    TypeDefinitionRegistry reg = new SchemaParser().parse(sdl);
    RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
        .type("Query", b -> b.dataFetcher("numbers", env -> List.of(1, 2, 3)))
        .build();
    GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
    Map<String, Object> data = GraphQL.newGraphQL(schema).build().execute("{ numbers }").getData();
    @SuppressWarnings("unchecked")
    List<Integer> numbers = (List<Integer>) data.get("numbers");
    for (Integer n : numbers) {
      System.out.println(n);
    }
  }
}
