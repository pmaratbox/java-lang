//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import java.util.Map;

public class NestedObject {
    public static void main(String[] args) {
        String sdl =
                "type Address { city: String } "
                        + "type User { address: Address } "
                        + "type Query { user: User }";
        TypeDefinitionRegistry registry = new SchemaParser().parse(sdl);

        RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
                .type("Query", builder -> builder.dataFetcher("user",
                        env -> Map.of("address", Map.of("city", "oslo"))))
                .build();

        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(registry, wiring);
        GraphQL graphQL = GraphQL.newGraphQL(schema).build();

        Map<String, Object> data = graphQL.execute("{ user { address { city } } }").getData();

        Map<String, Object> user = (Map<String, Object>) data.get("user");
        Map<String, Object> address = (Map<String, Object>) user.get("address");
        System.out.println(address.get("city"));
    }
}
