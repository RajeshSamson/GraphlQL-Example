package com.techpastors.graphql.service;

import com.techpastors.graphql.model.Article;
import com.techpastors.graphql.model.Feedback;
import com.techpastors.graphql.model.SortOrder;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {


    public List<Article> getArticles() {
        Article a1 = new Article();
        a1.setCreatedByUserId("1");
        a1.setCreatedOn(new Date());
        a1.setName("Test1");
        Article a2 = new Article();
        a2.setCreatedByUserId("2");
        a2.setCreatedOn(new Date());
        a2.setName("Test2");

        List<Article> articles = new ArrayList<>();
        articles.addAll(Arrays.asList(a1, a2));
        return articles;
    }


    @Override
    public List<Article> getAllArticles(int pageNumber, int pageSize, SortOrder sortOrder, String sortBy) {
        val sort = sortOrder.name();
        if (SortOrder.ASC.toString().equals(sort)) {
            return getArticles().stream().sorted(Comparator.comparing(Article::getName)).collect(Collectors.toList());
        } else {
            return getArticles().stream().sorted(Comparator.comparing(Article::getName).reversed()).collect(Collectors.toList());
        }
    }

    @Override
    public Article createArticle(String name, String createdByUserId) {
        return null;
    }

    @Override
    public List<Feedback> getFeedbacksForArticle(String articleId) {
        return null;
    }

    @Override
    public Feedback createFeedback(String feedbackText, String articleId, String createdByUserId) {
        return null;
    }
}
