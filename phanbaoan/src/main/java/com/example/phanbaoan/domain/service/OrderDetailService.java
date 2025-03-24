package com.example.phanbaoan.domain.service;

import com.example.phanbaoan.domain.entity.OrderDetail;
import com.example.phanbaoan.domain.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    // Lấy tất cả order details
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

    // Lấy order detail theo ID
    public Optional<OrderDetail> getOrderDetailById(int id) {
        return orderDetailRepository.findById(id);
    }

    // Lấy danh sách order details theo orderId
    public List<OrderDetail> getOrderDetailsByOrderId(int orderId) {
        return orderDetailRepository.findAll().stream()
                .filter(orderDetail -> orderDetail.getOrder().getOrderId() == orderId)
                .toList();
    }

    // Tạo mới hoặc cập nhật order detail
    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    // Xóa order detail theo ID
    public void deleteOrderDetailById(int id) {
        orderDetailRepository.deleteById(id);
    }
    
}
