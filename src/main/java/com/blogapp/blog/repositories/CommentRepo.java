package com.blogapp.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, java.lang.Integer> {

}
