package com.example.phanbaoan.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "method_id", nullable = false)
    private int methodId;

    // Constructor không tham số
    public Payment() {}

    // Constructor đầy đủ tham số
    public Payment(int paymentId, Order order, int methodId) {
        this.paymentId = paymentId;
        this.order = order;
        this.methodId = methodId;
    }

    // Getter và Setter
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getMethodId() {
        return methodId;
    }

    public void setMethodId(int methodId) {
        this.methodId = methodId;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", order=" + (order != null ? order.getOrderId() : "null") +
                ", methodId=" + methodId +
                '}';
    }
}
