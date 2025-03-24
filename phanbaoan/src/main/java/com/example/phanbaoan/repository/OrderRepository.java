package com.example.phanbaoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.phanbaoan.entity.Order;
import com.example.phanbaoan.entity.OrderDetail;

import java.util.List; // Thêm import này để dùng List

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<OrderDetail> findByOrderId(int orderId);
}
