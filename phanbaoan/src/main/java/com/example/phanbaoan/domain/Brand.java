package com.example.phanbaoan.domain;

public class Brand {
    private int brandId;
    private String image;
    private String name;

    // Constructor không tham số
    public Brand() {}

    // Constructor đầy đủ tham số
    public Brand(int brandId, String image, String name) {
        this.brandId = brandId;
        this.image = image;
        this.name = name;
    }

    // Getter và Setter
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
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

    // Phương thức toString
    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}