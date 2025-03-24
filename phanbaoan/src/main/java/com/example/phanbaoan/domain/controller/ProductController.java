package com.example.phanbaoan.domain.controller;

import com.example.phanbaoan.domain.entity.Product;
import com.example.phanbaoan.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    // Lấy tất cả sản phẩm
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Lấy sản phẩm theo ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // Lấy sản phẩm theo categoryId
    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable int categoryId) {
        return productService.getProductsByCategoryId(categoryId);
    }

    // Lấy sản phẩm theo giá
    @GetMapping("/price/{price}")
    public List<Product> getProductsByPriceLessThan(@PathVariable float price) {
        return productService.getProductsByPriceLessThan(price);
    }

    // Thêm sản phẩm mới
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // Cập nhật sản phẩm
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product newProduct) {
        return productService.updateProduct(id, newProduct);
    }

    // Xóa sản phẩm
    @DeleteMapping("/{id}")
    public boolean deleteProductById(@PathVariable int id) {
        return productService.deleteProductById(id);
    }
}
