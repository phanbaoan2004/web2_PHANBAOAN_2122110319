package com.example.phanbaoan.domain;

public class OrderDetail {
    private int orderId;
    private int productId;
    private float price;
    private int qty;

    // Constructor không tham số
    public OrderDetail() {}

    // Constructor đầy đủ tham số
    public OrderDetail(int orderId, int productId, float price, int qty) {
        this.orderId = orderId;
        this.productId = productId;
        this.price = price;
        this.qty = qty;
    }

    // Getter và Setter
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}