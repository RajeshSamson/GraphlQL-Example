package com.techpastors.graphql.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {


    /*@Bean
    public GraphQL graphQL() {
        GraphQLSchema schema = new GraphQLSchemaGenerator()
                .withResolverBuilders(
                        new AnnotatedResolverBuilder(),
                        new PublicResolverBuilder("com.techpastors.graphql"))
                .withOperationsFromSingleton(blogPostService)
                .withValueMapperFactory(new JacksonValueMapperFactory())
                .generate();
        return GraphQL.newGraphQL(schema)
                .queryExecutionStrategy(new BatchedExecutionStrategy())
                .instrumentation(new ChainedInstrumentation(Arrays.asList(
                        new MaxQueryComplexityInstrumentation(200),
                        new MaxQueryDepthInstrumentation(20)
                )))
                .build();
    }*/

}
