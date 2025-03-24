package com.example.phanbaoan.domain.service;

import com.example.phanbaoan.domain.entity.Banner;
import com.example.phanbaoan.domain.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {
    @Autowired
    private BannerRepository bannerRepository;

    // Lấy tất cả banner
    public List<Banner> getAllBanners() {
        return bannerRepository.findAll();
    }

    // Lấy banner theo ID
    public Banner getBannerById(int id) {
        return bannerRepository.findById(id).orElse(null);
    }

    // Thêm mới banner
    public Banner addBanner(Banner banner) {
        return bannerRepository.save(banner);
    }

    // Cập nhật banner
    public Banner updateBanner(int id, Banner newBanner) {
        return bannerRepository.findById(id).map(banner -> {
            banner.setName(newBanner.getName());
            banner.setImage(newBanner.getImage());
            return bannerRepository.save(banner);
        }).orElse(null);
    }

    // Xóa banner theo ID
    public boolean deleteBannerById(int id) {
        if (bannerRepository.existsById(id)) {
            bannerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
