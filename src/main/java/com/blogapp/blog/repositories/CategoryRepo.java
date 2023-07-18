package com.blogapp.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
