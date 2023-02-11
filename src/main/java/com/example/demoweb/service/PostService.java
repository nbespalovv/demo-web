package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> postList = new ArrayList<>();
        postList.add(new Post("text1"));
        postList.add(new Post("text2"));
        postList.add(new Post("text3"));

        return postList;
    }
}
