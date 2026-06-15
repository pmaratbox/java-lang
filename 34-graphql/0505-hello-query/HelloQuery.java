//DEPS com.graphql-java:graphql-java:22.3
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import java.util.Map;

public class HelloQuery {
    public static void main(String[] args) {
        String sdl = "type Query { hello: String }";
        TypeDefinitionRegistry registry = new SchemaParser().parse(sdl);

        RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
                .type("Query", builder -> builder.dataFetcher("hello", env -> "world"))
                .build();

        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(registry, wiring);
        GraphQL graphQL = GraphQL.newGraphQL(schema).build();

        Map<String, Object> data = graphQL.execute("{ hello }").getData();
        System.out.println(data.get("hello"));
    }
}
