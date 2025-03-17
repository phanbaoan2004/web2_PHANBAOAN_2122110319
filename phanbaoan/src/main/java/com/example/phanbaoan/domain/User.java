package com.example.phanbaoan.domain;

public class User {
    private int userId;
    private String name;
    private int role;
    private String phone;
    private String address;
    private String email;
    private String password;

    // Constructor không tham số
    public User() {}

    // Constructor đầy đủ tham số
    public User(int userId, String name, int role, String phone, String address, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    // Getter và Setter
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}