package com.example.phanbaoan.domain.service;

import com.example.phanbaoan.domain.entity.Category;
import com.example.phanbaoan.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // Lấy danh sách tất cả các danh mục
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Lấy danh mục theo ID
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Thêm danh mục mới
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Cập nhật danh mục
    public Category updateCategory(int id, Category newCategory) {
        return categoryRepository.findById(id).map(category -> {
            category.setName(newCategory.getName());
            category.setParentId(newCategory.getParentId());
            return categoryRepository.save(category);
        }).orElse(null);
    }

    // Xóa danh mục theo ID
    public boolean deleteCategoryById(int id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
