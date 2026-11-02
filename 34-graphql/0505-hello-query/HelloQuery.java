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
    var sdl = "type Query { hello: String }";
    var registry = new SchemaParser().parse(sdl);

    var wiring = RuntimeWiring.newRuntimeWiring()
            .type("Query", builder -> builder.dataFetcher("hello", env -> "world"))
            .build();

    var schema = new SchemaGenerator().makeExecutableSchema(registry, wiring);
    var graphQL = GraphQL.newGraphQL(schema).build();

    Map<String, Object> data = graphQL.execute("{ hello }").getData();
    System.out.println(data.get("hello"));
}
