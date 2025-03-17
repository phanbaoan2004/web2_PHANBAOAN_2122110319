package com.example.phanbaoan.domain;

import java.util.Date;

public class Order {
    private int orderId;
    private int userId;
    private String email;
    private String address;
    private String phone;
    private float totalPrice;
    private Date date;

    // Constructor không tham số
    public Order() {}

    // Constructor đầy đủ tham số
    public Order(int orderId, int userId, String email, String address, String phone, float totalPrice, Date date) {
        this.orderId = orderId;
        this.userId = userId;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.totalPrice = totalPrice;
        this.date = date;
    }

    // Getter và Setter
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                '}';
    }
}
