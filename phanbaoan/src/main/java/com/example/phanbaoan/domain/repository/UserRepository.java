package com.example.phanbaoan.domain.repository;

import com.example.phanbaoan.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
