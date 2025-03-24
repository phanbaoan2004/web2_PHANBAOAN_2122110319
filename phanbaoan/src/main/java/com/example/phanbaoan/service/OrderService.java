package com.example.phanbaoan.service;

import com.example.phanbaoan.entity.Order;
import com.example.phanbaoan.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Lấy tất cả orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Lấy order theo ID
    public Optional<Order> getOrderById(int orderId) {
        return orderRepository.findById(orderId);
    }

    // Tạo mới hoặc cập nhật order
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Xóa order theo ID
    public void deleteOrderById(int orderId) {
        orderRepository.deleteById(orderId);
    }
}