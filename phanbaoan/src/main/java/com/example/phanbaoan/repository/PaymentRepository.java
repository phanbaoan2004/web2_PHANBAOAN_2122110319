package com.example.phanbaoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phanbaoan.entity.Payment;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    // Sử dụng truy vấn theo đối tượng Order
    List<Payment> findByOrder_OrderId(int orderId);
}