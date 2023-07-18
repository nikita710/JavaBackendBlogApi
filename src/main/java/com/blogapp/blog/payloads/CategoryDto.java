package com.blogapp.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	
	@NotEmpty
	@Size(min=4, message = "Category Title must be greater than 4 characters ")
	private String categoryTitle;
	
	@NotEmpty
	@Size(min=10, message = "Category Description must be greater than 10 characters ")
	private String categoryDescription;
}
