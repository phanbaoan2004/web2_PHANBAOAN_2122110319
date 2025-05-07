package com.example.phanbaoan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phanbaoan.entity.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {

    
}