package com.example.phanbaoan.repository;

import org. springframework.data.jpa.repository. JpaRepository;
import org. springframework. stereotype. Repository;

import com.example.phanbaoan.entity.OrderItem;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
}