package com.example.phanbaoan.domain;

public class Product {
    private int productId;
    private String image;
    private String name;
    private String description;
    private int categoryId;
    private float price;
    private float discount;
    private int brandId;

    // Constructor không tham số
    public Product() {}

    // Constructor đầy đủ tham số
    public Product(int productId, String image, String name, String description, int categoryId, float price, float discount, int brandId) {
        this.productId = productId;
        this.image = image;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.price = price;
        this.discount = discount;
        this.brandId = brandId;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", discount=" + discount +
                ", brandId=" + brandId +
                '}';
    }
}
