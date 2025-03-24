package com.example.phanbaoan.controller;

import com.example.phanbaoan.entity.Category;
import com.example.phanbaoan.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // Lấy tất cả danh mục
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // Lấy danh mục theo ID
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    // Thêm danh mục mới
    @PostMapping
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    // Cập nhật danh mục
    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category newCategory) {
        return categoryService.updateCategory(id, newCategory);
    }

    // Xóa danh mục theo ID
    @DeleteMapping("/{id}")
    public boolean deleteCategoryById(@PathVariable int id) {
        return categoryService.deleteCategoryById(id);
    }
}
