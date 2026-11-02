//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;
void main() {
  var sdl = "type User { name: String age: Int } type Query { user: User }";
  var reg = new SchemaParser().parse(sdl);
  var wiring = RuntimeWiring.newRuntimeWiring()
      .type("Query", b -> b.dataFetcher("user", env -> Map.of("name", "alice", "age", 30)))
      .build();
  var schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
  Map<String,Object> data = GraphQL.newGraphQL(schema).build().execute("{ user { name age } }").getData();
  var user = (Map<String,Object>) data.get("user");
  System.out.println(user.get("name"));
  System.out.println(user.get("age"));
}
