package com.example.phanbaoan.domain.service;

import com.example.phanbaoan.domain.entity.Payment;
import com.example.phanbaoan.domain.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
   
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getPaymentsByOrderId(int orderId) {
        return paymentRepository.findByOrder_OrderId(orderId);
    }
    
    // Lấy tất cả thông tin thanh toán
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Lấy thông tin thanh toán theo orderId
 

    // Thêm thanh toán mới
    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Cập nhật thông tin thanh toán
    public Payment updatePayment(int id, Payment newPayment) {
        return paymentRepository.findById(id).map(payment -> {
            payment.setOrder(newPayment.getOrder()); // Đặt đối tượng Order mới
            payment.setMethodId(newPayment.getMethodId());
            return paymentRepository.save(payment);
        }).orElse(null);
    }

    // Xóa thanh toán theo ID
    public boolean deletePaymentById(int id) {
        if (paymentRepository.existsById(id)) {
            paymentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
