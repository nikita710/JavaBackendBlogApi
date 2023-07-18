package com.blogapp.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapp.blog.entities.Category;
import com.blogapp.blog.exceptions.ResourceNotFoundException;
import com.blogapp.blog.payloads.CategoryDto;
import com.blogapp.blog.repositories.CategoryRepo;
import com.blogapp.blog.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category addCategory = categoryRepo.save(category);

		return modelMapper.map(addCategory, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category category = categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category	", "Category Id ", categoryId));

		category.setCategoryTitle(categoryDto.getCategoryTitle());
		category.setCategoryDescription(categoryDto.getCategoryDescription());

		Category upadtedCategory = categoryRepo.save(category);

		return modelMapper.map(upadtedCategory, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category ", "Category Id ", categoryId));

		categoryRepo.delete(category);
	}

	@Override
	public CategoryDto getCategory(Integer caegoryId) {
		Category category = categoryRepo.findById(caegoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category ", "Category Id", caegoryId));

		return modelMapper.map(category, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categories = categoryRepo.findAll();

		List<CategoryDto> categoryDtos = categories.stream().map((cat) -> modelMapper.map(cat, CategoryDto.class))
				.collect(Collectors.toList());

		return categoryDtos;
	}

}
