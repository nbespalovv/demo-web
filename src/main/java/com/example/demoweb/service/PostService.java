package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post("text1"));
        posts.add(new Post("text2"));
        posts.add(new Post("text3"));
    }


    ArrayList<Post> posts;

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
