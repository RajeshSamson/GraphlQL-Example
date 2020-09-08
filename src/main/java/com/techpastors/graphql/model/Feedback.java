package com.techpastors.graphql.model;

import lombok.Data;

import java.util.Date;

@Data
public class Feedback {

    private String id;
    private String feedbackText;
    private String articleId;
    private String createdByUserId;
    private Date createdOn;
    private Date lastUpdatedOn;

}
