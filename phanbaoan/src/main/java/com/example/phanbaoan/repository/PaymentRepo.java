package com.example.phanbaoan.repository;
import org. springframework.data. jpa.repository. JpaRepository;
import org. springframework.stereotype. Repository;

import com.example.phanbaoan.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}