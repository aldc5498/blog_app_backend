package com.braveone.blog.services;

import java.util.List;

import com.braveone.blog.payloads.CategoryDto;


public interface CategoryService {
	
	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//Update
	CategoryDto  updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//Delete
	void deleteCategory(Integer categoryId);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	//get all
	List<CategoryDto> getCategoies();

	
}
