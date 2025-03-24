package com.example.phanbaoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.phanbaoan.entity.Banner;

public interface BannerRepository extends JpaRepository<Banner, Integer> {
}