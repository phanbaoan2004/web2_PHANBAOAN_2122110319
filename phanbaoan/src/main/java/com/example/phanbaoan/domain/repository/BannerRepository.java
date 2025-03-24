package com.example.phanbaoan.domain.repository;

import com.example.phanbaoan.domain.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Integer> {
}