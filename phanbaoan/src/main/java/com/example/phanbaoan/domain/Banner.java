package com.example.phanbaoan.domain;

public class Banner {
    private int bannerId;
    private String name;
    private String image;

    // Constructor không tham số
    public Banner() {}

    // Constructor đầy đủ tham số
    public Banner(int bannerId, String name, String image) {
        this.bannerId = bannerId;
        this.name = name;
        this.image = image;
    }

    // Getter và Setter
    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Banner{" +
                "bannerId=" + bannerId +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
