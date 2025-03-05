package com.example.demo1.controller;

import com.example.demo1.dto.PostDTO;
import com.example.demo1.entity.PostEntity;
import com.example.demo1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public PostEntity createUser(@RequestBody PostDTO postDTO) {
        return postService.createUser(postDTO);
    }
    @GetMapping
    public List<PostEntity> getAllUsers() {
        return postService.getAllUsers();
    }
    @GetMapping("/{id}")
    public PostEntity getUser(@PathVariable Long id) {
        return PostService.getUserById(id);
    }
    @PutMapping("/{id}")
    public PostEntity updateUser(@PathVariable Long id, @RequestBody PostDTO postDTO) {
        return postService.updateUser(id, postDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        postService.deleteUser(id);
    }



}

