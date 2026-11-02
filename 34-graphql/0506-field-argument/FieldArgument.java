//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import java.util.Map;

void main() {
  var sdl = "type Query { greet(name: String!): String }";
  var reg = new SchemaParser().parse(sdl);
  var wiring = RuntimeWiring.newRuntimeWiring()
      .type("Query", b -> b.dataFetcher("greet",
          env -> "hello " + env.getArgument("name")))
      .build();
  var schema = new SchemaGenerator().makeExecutableSchema(reg, wiring);
  Map<String, Object> data = GraphQL.newGraphQL(schema).build()
      .execute("{ greet(name: \"alice\") }").getData();
  System.out.println(data.get("greet"));
}
