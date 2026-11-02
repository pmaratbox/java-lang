//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;

void main() {
  var sdl = "type User { name: String }\n"
      + "type Query { _empty: String }\n"
      + "type Mutation { addUser(name: String!): User }";
  var reg = new SchemaParser().parse(sdl);
  var wiring = RuntimeWiring.newRuntimeWiring()
      .type("Mutation", b -> b.dataFetcher("addUser",
          env -> Map.of("name", env.getArgument("name"))))
      .build();
  var schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
  Map<String, Object> data = GraphQL.newGraphQL(schema).build()
      .execute("mutation { addUser(name: \"bob\") { name } }").getData();
  @SuppressWarnings("unchecked")
  var addUser = (Map<String, Object>) data.get("addUser");
  System.out.println(addUser.get("name"));
}
