package com.example.phanbaoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phanbaoan.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
