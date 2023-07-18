package com.blogapp.blog.services;

import java.util.List;

import com.blogapp.blog.payloads.CategoryDto;

public interface CategoryService {

	// create
	CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	void deleteCategory(Integer categoryId);

	// get single
	CategoryDto getCategory(Integer caegoryId);

	// get All
	List<CategoryDto> getCategories();
}
