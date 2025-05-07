package com.example.phanbaoan.service;

import com.example.phanbaoan.entity.Category;
import com.example.phanbaoan.payloads.CategoryDTO;
import com.example.phanbaoan.payloads.CategoryResponse;

public interface CategoryService {

    CategoryDTO createCategory(Category category);

    CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO updateCategory(Category category, Long categoryId);

    String deleteCategory(Long categoryId);

    CategoryDTO getCategoryById(Long categoryId);
}
