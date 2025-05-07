package com.example.phanbaoan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bannerId;
    private String name;
    private String image;

    public Banner() {}


    public Banner(int bannerId, String name, String image) {
        this.bannerId = bannerId;
        this.name = name;
        this.image = image;
    }

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


    @Override
    public String toString() {
        return "Banner{" +
                "bannerId=" + bannerId +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
