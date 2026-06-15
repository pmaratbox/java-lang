//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;

public class Mutation {
  public static void main(String[] args) {
    String sdl = "type User { name: String }\n"
        + "type Query { _empty: String }\n"
        + "type Mutation { addUser(name: String!): User }";
    TypeDefinitionRegistry reg = new SchemaParser().parse(sdl);
    RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
        .type("Mutation", b -> b.dataFetcher("addUser",
            env -> Map.of("name", env.getArgument("name"))))
        .build();
    GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
    Map<String, Object> data = GraphQL.newGraphQL(schema).build()
        .execute("mutation { addUser(name: \"bob\") { name } }").getData();
    @SuppressWarnings("unchecked")
    Map<String, Object> addUser = (Map<String, Object>) data.get("addUser");
    System.out.println(addUser.get("name"));
  }
}
