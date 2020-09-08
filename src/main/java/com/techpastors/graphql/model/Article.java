package com.techpastors.graphql.model;

import lombok.Data;

import java.util.Date;

@Data
public class Article {

    private String id;
    private String name;
    private String createdByUserId;
    private Date createdOn;
    private Date lastUpdatedOn;

}
