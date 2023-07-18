package com.blogapp.blog.services;

import java.util.List;

import com.blogapp.blog.payloads.PostDto;
import com.blogapp.blog.payloads.PostResponse;

public interface PostService {
	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	// List<PostDto> getAllPost();

	// get single post
	PostDto getPostById(Integer postId);

	// get all posts by category
	List<PostDto> getPostByCategory(Integer categoryId);

	// get all posts by user
	List<PostDto> getPostsByUser(Integer userId);

	// search post
	List<PostDto> searchPost(String keyword);
}
