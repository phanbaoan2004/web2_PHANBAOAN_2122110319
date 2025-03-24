package com.example.phanbaoan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phanbaoan.entity.Brand;
import com.example.phanbaoan.entity.Category;
import com.example.phanbaoan.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Tìm sản phẩm theo danh mục
    List<Product> findByCategory(Category category);
    List<Product> findByBrand(Brand brand);
    
    // Tìm sản phẩm có giá thấp hơn
    List<Product> findByPriceLessThan(float price);
}