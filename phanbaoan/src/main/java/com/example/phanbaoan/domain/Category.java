package com.example.phanbaoan.domain;

public class Category {
    private int categoryId;
    private String name;
    private int parentId;

    // Constructor không tham số
    public Category() {}

    // Constructor đầy đủ tham số
    public Category(int categoryId, String name, int parentId) {
        this.categoryId = categoryId;
        this.name = name;
        this.parentId = parentId;
    }

    // Getter và Setter
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
