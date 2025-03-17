package com.example.phanbaoan.domain;

public class Payment {
    private int paymentId;
    private int orderId;
    private int methodId;

    // Constructor không tham số
    public Payment() {}

    // Constructor đầy đủ tham số
    public Payment(int paymentId, int orderId, int methodId) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.methodId = methodId;
    }

    // Getter và Setter
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
                ", orderId=" + orderId +
                ", methodId=" + methodId +
                '}';
    }
}
