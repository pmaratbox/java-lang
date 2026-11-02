//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.ExecutionInput;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;

void main() {
  var sdl = "type Query { item(id: Int!): Item } type Item { id: Int }";
  var reg = new SchemaParser().parse(sdl);
  var wiring = RuntimeWiring.newRuntimeWiring()
      .type("Query", b -> b.dataFetcher("item",
          env -> Map.of("id", env.getArgument("id"))))
      .build();
  var schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);

  var query = "query($id: Int!) { item(id: $id) { id } }";
  var input = ExecutionInput.newExecutionInput()
      .query(query)
      .variables(Map.of("id", 42))
      .build();

  Map<String, Object> data = GraphQL.newGraphQL(schema).build().execute(input).getData();
  var item = (Map<String, Object>) data.get("item");
  IO.println(item.get("id"));
}
