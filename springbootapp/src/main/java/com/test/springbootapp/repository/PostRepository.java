package com.test.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springbootapp.dto.PostDto;

public interface PostRepository
    extends JpaRepository<PostDto, Long> {
        //List<Post> getPostByFirstName(String firstName);
}
