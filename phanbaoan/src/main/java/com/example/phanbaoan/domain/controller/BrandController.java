package com.example.phanbaoan.domain.controller;

import com.example.phanbaoan.domain.entity.Brand;
import com.example.phanbaoan.domain.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    // Lấy tất cả thương hiệu
    @GetMapping
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

    // Lấy thương hiệu theo ID
    @GetMapping("/{id}")
    public Brand getBrandById(@PathVariable int id) {
        return brandService.getBrandById(id);
    }

    // Thêm thương hiệu mới
    @PostMapping
    public Brand addBrand(@RequestBody Brand brand) {
        return brandService.addBrand(brand);
    }

    // Cập nhật thương hiệu
    @PutMapping("/{id}")
    public Brand updateBrand(@PathVariable int id, @RequestBody Brand newBrand) {
        return brandService.updateBrand(id, newBrand);
    }

    // Xóa thương hiệu theo ID
    @DeleteMapping("/{id}")
    public boolean deleteBrandById(@PathVariable int id) {
        return brandService.deleteBrandById(id);
    }
}
