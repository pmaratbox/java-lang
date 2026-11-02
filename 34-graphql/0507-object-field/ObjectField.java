//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;
void main() {
  var sdl = "type User { name: String } type Query { user: User }";
  var reg = new SchemaParser().parse(sdl);
  var wiring = RuntimeWiring.newRuntimeWiring()
      .type("Query", b -> b.dataFetcher("user", env -> Map.of("name", "alice")))
      .build();
  var schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
  Map<String,Object> data = GraphQL.newGraphQL(schema).build().execute("{ user { name } }").getData();
  var user = (Map<String,Object>) data.get("user");
  IO.println(user.get("name"));
}
