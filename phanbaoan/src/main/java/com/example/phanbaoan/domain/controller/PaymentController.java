package com.example.phanbaoan.domain.controller;

import com.example.phanbaoan.domain.entity.Payment;
import com.example.phanbaoan.domain.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    // Lấy tất cả thông tin thanh toán
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Lấy thông tin thanh toán theo orderId
    @GetMapping("/order/{orderId}")
    public List<Payment> getPaymentsByOrderId(@PathVariable int orderId) {
        return paymentService.getPaymentsByOrderId(orderId);
    }

    // Thêm thanh toán mới
    @PostMapping
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentService.addPayment(payment);
    }

    // Cập nhật thông tin thanh toán
    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable int id, @RequestBody Payment newPayment) {
        return paymentService.updatePayment(id, newPayment);
    }

    // Xóa thanh toán theo ID
    @DeleteMapping("/{id}")
    public boolean deletePaymentById(@PathVariable int id) {
        return paymentService.deletePaymentById(id);
    }
}
