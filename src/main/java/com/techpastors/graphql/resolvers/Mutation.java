package com.techpastors.graphql.resolvers;


import com.techpastors.graphql.model.Article;
import com.techpastors.graphql.model.Feedback;
import com.techpastors.graphql.service.ArticleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final ArticleService articleService;

    public Mutation(ArticleService articleService) {
        this.articleService = articleService;
    }

    public Article createArticle(String name, String createdByUserId) {
        return articleService.createArticle(name, createdByUserId);
    }

    public Feedback createNewFeedback(String feedbackText, String articleId, String createdByUserId) {
        return articleService.createFeedback(feedbackText, articleId, createdByUserId);
    }
}
