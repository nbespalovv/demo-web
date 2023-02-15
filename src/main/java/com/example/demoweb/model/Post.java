package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private int likes;

    private Date creationDate;

    private Long id;

    public Date getCreationDate() {
        return creationDate;
    }

    public Post(Long id, String text) {
        this.id = id;
        this.text = text;
        creationDate = new Date();
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

    public int getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
}
