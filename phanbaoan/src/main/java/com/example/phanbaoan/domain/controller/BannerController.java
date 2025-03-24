package com.example.phanbaoan.domain.controller;

import com.example.phanbaoan.domain.entity.Banner;
import com.example.phanbaoan.domain.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banners")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    // Lấy tất cả banner
    @GetMapping
    public List<Banner> getAllBanners() {
        return bannerService.getAllBanners();
    }

    // Lấy banner theo ID
    @GetMapping("/{id}")
    public Banner getBannerById(@PathVariable int id) {
        return bannerService.getBannerById(id);
    }

    // Thêm mới banner
    @PostMapping
    public Banner addBanner(@RequestBody Banner banner) {
        return bannerService.addBanner(banner);
    }

    // Cập nhật banner
    @PutMapping("/{id}")
    public Banner updateBanner(@PathVariable int id, @RequestBody Banner newBanner) {
        return bannerService.updateBanner(id, newBanner);
    }

    // Xóa banner theo ID
    @DeleteMapping("/{id}")
    public boolean deleteBannerById(@PathVariable int id) {
        return bannerService.deleteBannerById(id);
    }
}
