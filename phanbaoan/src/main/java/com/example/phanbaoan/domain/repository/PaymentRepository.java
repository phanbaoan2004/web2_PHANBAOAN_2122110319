package com.example.phanbaoan.domain.repository;

import com.example.phanbaoan.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    // Sử dụng truy vấn theo đối tượng Order
    List<Payment> findByOrder_OrderId(int orderId);
}