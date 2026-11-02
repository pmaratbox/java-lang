//JAVA 26
//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import java.util.Map;

void main() {
    var sdl =
            "type Address { city: String } "
                    + "type User { address: Address } "
                    + "type Query { user: User }";
    var registry = new SchemaParser().parse(sdl);

    var wiring = RuntimeWiring.newRuntimeWiring()
            .type("Query", builder -> builder.dataFetcher("user",
                    env -> Map.of("address", Map.of("city", "oslo"))))
            .build();

    var schema = new SchemaGenerator().makeExecutableSchema(registry, wiring);
    var graphQL = GraphQL.newGraphQL(schema).build();

    Map<String, Object> data = graphQL.execute("{ user { address { city } } }").getData();

    var user = (Map<String, Object>) data.get("user");
    var address = (Map<String, Object>) user.get("address");
    System.out.println(address.get("city"));
}
