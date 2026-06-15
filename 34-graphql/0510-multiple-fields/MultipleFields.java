//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;
public class MultipleFields {
  public static void main(String[] a) {
    String sdl = "type User { name: String age: Int } type Query { user: User }";
    TypeDefinitionRegistry reg = new SchemaParser().parse(sdl);
    RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
        .type("Query", b -> b.dataFetcher("user", env -> Map.of("name", "alice", "age", 30)))
        .build();
    GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
    Map<String,Object> data = GraphQL.newGraphQL(schema).build().execute("{ user { name age } }").getData();
    Map<String,Object> user = (Map<String,Object>) data.get("user");
    System.out.println(user.get("name"));
    System.out.println(user.get("age"));
  }
}
