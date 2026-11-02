//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.List;
import java.util.Map;

void main() {
  var sdl = "type Query { numbers: [Int] }";
  var reg = new SchemaParser().parse(sdl);
  var wiring = RuntimeWiring.newRuntimeWiring()
      .type("Query", b -> b.dataFetcher("numbers", env -> List.of(1, 2, 3)))
      .build();
  var schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
  Map<String, Object> data = GraphQL.newGraphQL(schema).build().execute("{ numbers }").getData();
  @SuppressWarnings("unchecked")
  var numbers = (List<Integer>) data.get("numbers");
  for (var n : numbers) {
    System.out.println(n);
  }
}
