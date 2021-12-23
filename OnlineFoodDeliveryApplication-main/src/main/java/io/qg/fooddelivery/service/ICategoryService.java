package io.qg.fooddelivery.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.qg.fooddelivery.models.Category;

@Service
public interface ICategoryService {
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat,Long id);
	public ResponseEntity<Category> removeCategory(Long id);
	public Category viewCategoryById(Long id);
	public List<Category> viewAllCategories();

}
