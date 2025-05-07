package com.example.phanbaoan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.phanbaoan.config.AppConstants;
import com.example.phanbaoan.entity.Category;
import com.example.phanbaoan.payloads.CategoryDTO;
import com.example.phanbaoan.payloads.CategoryResponse;
import com.example.phanbaoan.service.CategoryService;

@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "E-Commerce Application")
@CrossOrigin(origins = "*")
public class CategoryController {

     @Autowired
     private CategoryService categoryService;

     @PostMapping("/admin/category")
     public ResponseEntity<CategoryDTO> createCategory(@Valid @RequestBody Category category) {
          CategoryDTO savedCategoryDTO = categoryService.createCategory(category);
          return new ResponseEntity<CategoryDTO>(savedCategoryDTO, HttpStatus.CREATED);
     }

     @GetMapping("/public/categories")
     public ResponseEntity<CategoryResponse> getCategories(
               @RequestParam(name = "pageNumber", defaultValue = AppConstants.PAGE_NUMBER, required = false) Integer pageNumber,
               @RequestParam(name = "pageSize", defaultValue = AppConstants.PAGE_SIZE, required = false) Integer pageSize,
               @RequestParam(name = "sortBy", defaultValue = AppConstants.SORT_CATEGORIES_BY, required = false) String sortBy,
               @RequestParam(name = "sortOrder", defaultValue = AppConstants.SORT_DIR, required = false) String sortOrder) {

          CategoryResponse categoryResponse = categoryService.getCategories(
                    pageNumber == 0 ? pageNumber : pageNumber - 1, pageSize,
                    "id".equals(sortBy) ? "categoryId" : sortBy, sortOrder);

          return new ResponseEntity<CategoryResponse>(categoryResponse, HttpStatus.OK);
     }

     @GetMapping("/public/categories/{categoryId}")
     public ResponseEntity<CategoryDTO> getOneCategory(@PathVariable Long categoryId) {
          CategoryDTO categoryDTO = categoryService.getCategoryById(categoryId);
          return new ResponseEntity<>(categoryDTO, HttpStatus.OK);
     }

     @PutMapping("/admin/categories/{categoryId}")
     public ResponseEntity<CategoryDTO> updateCategory(@RequestBody Category category,
               @PathVariable Long categoryId) {

          CategoryDTO categoryDTO = categoryService.updateCategory(category, categoryId);
          return new ResponseEntity<CategoryDTO>(categoryDTO, HttpStatus.OK);
     }

     @DeleteMapping("/admin/categories/{categoryId}")
     public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {
          String status = categoryService.deleteCategory(categoryId);
          return new ResponseEntity<String>(status, HttpStatus.OK);
     }
}
