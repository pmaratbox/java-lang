//DEPS com.graphql-java:graphql-java:22.3
import graphql.ExecutionInput;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;

public class Variables {
  public static void main(String[] args) {
    String sdl = "type Query { item(id: Int!): Item } type Item { id: Int }";
    TypeDefinitionRegistry reg = new SchemaParser().parse(sdl);
    RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
        .type("Query", b -> b.dataFetcher("item",
            env -> Map.of("id", env.getArgument("id"))))
        .build();
    GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);

    String query = "query($id: Int!) { item(id: $id) { id } }";
    ExecutionInput input = ExecutionInput.newExecutionInput()
        .query(query)
        .variables(Map.of("id", 42))
        .build();

    Map<String, Object> data = GraphQL.newGraphQL(schema).build().execute(input).getData();
    Map<String, Object> item = (Map<String, Object>) data.get("item");
    System.out.println(item.get("id"));
  }
}
