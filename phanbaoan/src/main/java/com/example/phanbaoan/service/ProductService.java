package com.example.phanbaoan.service;

import com.example.phanbaoan.entity.Brand;
import com.example.phanbaoan.entity.Category;
import com.example.phanbaoan.entity.Product;
import com.example.phanbaoan.repository.BrandRepository;
import com.example.phanbaoan.repository.CategoryRepository;
import com.example.phanbaoan.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private BrandRepository brandRepository;

    
       public List<Product> getProductsByBrand(Brand brand) {
        return productRepository.findByBrand(brand);
    }
    
    public List<Product> getProductsByCategoryId(int categoryId) {
        Category category = categoryRepository.findById(categoryId).orElse(null);
        if (category == null) {
            throw new IllegalArgumentException("Category with ID " + categoryId + " not found");
        }
        return productRepository.findByCategory(category);
    }
    // Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Lấy sản phẩm theo ID
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    // Tìm sản phẩm theo categoryId

    // Tìm sản phẩm có giá thấp hơn
    public List<Product> getProductsByPriceLessThan(float price) {
        return productRepository.findByPriceLessThan(price);
    }

    // Thêm sản phẩm mới
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product newProduct) {
        return productRepository.findById(id).map(product -> {
            product.setName(newProduct.getName());
            product.setDescription(newProduct.getDescription());
            product.setImage(newProduct.getImage());
            product.setPrice(newProduct.getPrice());
            product.setDiscount(newProduct.getDiscount());
    
            // Thiết lập Brand nếu tồn tại
            if (newProduct.getBrand() != null && newProduct.getBrand().getBrandId() > 0) {
                Brand brand = brandRepository.findById(newProduct.getBrand().getBrandId()).orElse(null);
                product.setBrand(brand);
            } else {
                product.setBrand(null); // Bỏ liên kết nếu không có Brand
            }
    
            // Thiết lập Category nếu tồn tại
            if (newProduct.getCategory() != null && newProduct.getCategory().getCategoryId() > 0) {
                Category category = categoryRepository.findById(newProduct.getCategory().getCategoryId()).orElse(null);
                product.setCategory(category);
            } else {
                product.setCategory(null); // Bỏ liên kết nếu không có Category
            }
    
            return productRepository.save(product);
        }).orElse(null);
    }
    


    // Xóa sản phẩm
    public boolean deleteProductById(int id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
