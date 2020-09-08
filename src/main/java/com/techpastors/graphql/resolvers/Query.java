package com.techpastors.graphql.resolvers;

import com.techpastors.graphql.model.Article;
import com.techpastors.graphql.model.Feedback;
import com.techpastors.graphql.model.SortOrder;
import com.techpastors.graphql.service.ArticleService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final ArticleService articleService;


    public List<Article> getAllArticles(int pageNumber, int pageSize, SortOrder sortOrder, String sortBy) {
        return articleService.getAllArticles(pageNumber, pageSize, sortOrder, sortBy);
    }

    public List<Feedback> getFeedBacksForArticle(String articleId) {
        return articleService.getFeedbacksForArticle(articleId);
    }
}
