//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;

public class FieldArgument {
  public static void main(String[] args) {
    String sdl = "type Query { greet(name: String!): String }";
    TypeDefinitionRegistry reg = new SchemaParser().parse(sdl);
    RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
        .type("Query", b -> b.dataFetcher("greet",
            env -> "hello " + env.getArgument("name")))
        .build();
    GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
    Map<String, Object> data = GraphQL.newGraphQL(schema).build()
        .execute("{ greet(name: \"alice\") }").getData();
    System.out.println(data.get("greet"));
  }
}
