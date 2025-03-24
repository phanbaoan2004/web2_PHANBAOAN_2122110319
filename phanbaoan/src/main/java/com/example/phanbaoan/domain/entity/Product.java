package com.example.phanbaoan.domain.entity;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String image;

    private String name;

    private String description;

    private float price;

    private float discount;

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "brandId", nullable = false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId", nullable = false)
    private Category category;

    
    // Constructor không tham số
    public Product() {}

    // Constructor đầy đủ tham số
    public Product(int productId, String image, String name, String description, float price, float discount, Brand brand, Category category) {
        this.productId = productId;
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.brand = brand;
        this.category = category;
    }

    // Getter và Setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", brand=" + (brand != null ? brand.getBrandId() : "null") +
                ", category=" + (category != null ? category.getCategoryId() : "null") +
                '}';
    }
}
