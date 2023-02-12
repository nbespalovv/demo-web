package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;

    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    public Post(String text) {
        this.text = text;
        creationDate = new Date();
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}
