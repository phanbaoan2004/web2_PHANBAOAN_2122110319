package com.example.phanbaoan.service;

import com.example.phanbaoan.entity.Brand;
import com.example.phanbaoan.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    // Lấy danh sách tất cả các thương hiệu
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    // Lấy thương hiệu theo ID
    public Brand getBrandById(int id) {
        return brandRepository.findById(id).orElse(null);
    }

    // Thêm mới thương hiệu
    public Brand addBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    // Cập nhật thương hiệu
    public Brand updateBrand(int id, Brand newBrand) {
        return brandRepository.findById(id).map(brand -> {
            brand.setName(newBrand.getName());
            brand.setImage(newBrand.getImage());
            return brandRepository.save(brand);
        }).orElse(null);
    }

    // Xóa thương hiệu theo ID
    public boolean deleteBrandById(int id) {
        if (brandRepository.existsById(id)) {
            brandRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
