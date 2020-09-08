package com.techpastors.graphql.service;

import com.techpastors.graphql.model.Feedback;
import com.techpastors.graphql.model.Article;
import com.techpastors.graphql.model.SortOrder;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles(int pageNumber, int pageSize, SortOrder sortOrder, String sortBy);

    Article createArticle(String name, String createdByUserId);

    List<Feedback> getFeedbacksForArticle(String articleId);

    Feedback createFeedback(String feedbackText, String articleId, String createdByUserId);
}
